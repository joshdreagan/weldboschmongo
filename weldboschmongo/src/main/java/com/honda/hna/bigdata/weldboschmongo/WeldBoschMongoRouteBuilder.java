package com.honda.hna.bigdata.weldboschmongo;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonDataFormat;
import org.apache.camel.model.dataformat.JsonLibrary;

public class WeldBoschMongoRouteBuilder extends RouteBuilder {

	private JsonDataFormat weldBosch;
	private AuditEventNotifier aen;
	
	@Override
	public void configure() throws Exception {

		aen = new AuditEventNotifier();
		getContext().getManagementStrategy().addEventNotifier(aen);

		weldBosch = new JsonDataFormat(JsonLibrary.Jackson);
		weldBosch.setUnmarshalType(WeldBosch.class);

		from("activemq:queue:Consumer.mongodb.VirtualTopic.weldBoschtest2?concurrentConsumers=200")
			.unmarshal(weldBosch)
			.marshal(weldBosch)
			.convertBodyTo(String.class)
			.toD("mongodb:mongoBean?database=weld2&collection=bosch2&operation=insert");

	}

}
