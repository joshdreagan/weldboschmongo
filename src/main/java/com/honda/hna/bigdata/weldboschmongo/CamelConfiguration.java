package com.honda.hna.bigdata.weldboschmongo;

import org.apache.camel.LoggingLevel;
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
    
    from("jms:queue:Consumer.mongodb.VirtualTopic.weldBoschtest2?connectionFactory=#pooledJmsConnectionFactory&concurrentConsumers=200&disableReplyTo=true")
      .routeId("weldBoschIngest")
      .log(LoggingLevel.INFO, log, "Picked up message:\\n${body}")
			.unmarshal().json(JsonLibrary.Jackson, WeldBosch.class)
			.marshal().json(JsonLibrary.Jackson)
      .convertBodyTo(String.class)
			.to("mongodb:mongo?database={{application.mongodb.database}}&collection={{application.mongodb.collection}}&operation=insert")
    ;
  }
}
