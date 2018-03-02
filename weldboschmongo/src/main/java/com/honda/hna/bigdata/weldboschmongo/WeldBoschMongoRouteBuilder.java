package com.honda.hna.bigdata.weldboschmongo;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonDataFormat;
import org.apache.camel.model.dataformat.JsonLibrary;

public class WeldBoschMongoRouteBuilder extends RouteBuilder {

	private JsonDataFormat weldBosch;
	
	@Override
	public void configure() throws Exception {
		weldBosch = new JsonDataFormat(JsonLibrary.Jackson);
		weldBosch.setUnmarshalType(WeldBosch.class);

		from("activemq:queue:Consumer.mongodb.VirtualTopic.weldBoschvt?concurrentConsumers=200")
			.toD("mongodb:mongoBean?database=weld&collection=bosch&operation=insert");

	}

}
