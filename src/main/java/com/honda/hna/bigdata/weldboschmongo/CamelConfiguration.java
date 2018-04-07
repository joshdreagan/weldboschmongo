package com.honda.hna.bigdata.weldboschmongo;

import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class CamelConfiguration extends RouteBuilder {

  private static final Logger log = LoggerFactory.getLogger(CamelConfiguration.class);
  
  @Override
  public void configure() throws Exception {
    
    from("timer:sim?period=5000&repeatCount=5")
      .routeId("sim")
      .setBody().groovy("return new com.honda.hna.bigdata.weldboschsim.WeldBosch(exchange.properties['CamelTimerName'], exchange.properties['CamelTimerCounter']);")
      .marshal().json(JsonLibrary.Jackson, com.honda.hna.bigdata.weldboschsim.WeldBosch.class)
      .to(ExchangePattern.InOnly, "jms:topic:VirtualTopic.weldBoschtest2?connectionFactory=#pooledJmsConnectionFactory")
    ;
    
    from("jms:queue:Consumer.mongodb.VirtualTopic.weldBoschtest2?connectionFactory=#pooledJmsConnectionFactory&concurrentConsumers=200&disableReplyTo=true")
      .routeId("weldBoschIngest")
			.unmarshal().json(JsonLibrary.Jackson, WeldBosch.class)
			.marshal().json(JsonLibrary.Jackson)
      .convertBodyTo(String.class)
			.to("mongodb:mongo?database={{application.mongodb.database}}&collection={{application.mongodb.collection}}&operation=insert")
    ;
  }
}
