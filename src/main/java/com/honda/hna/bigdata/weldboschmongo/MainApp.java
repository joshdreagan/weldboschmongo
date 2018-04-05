package com.honda.hna.bigdata.weldboschmongo;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.pool.PooledConnectionFactory;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.main.Main;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class MainApp {

	public static void main(String[] args) throws Exception {
		Main main = new Main();
	    
		ActiveMQConnectionFactory activemqfactory = new ActiveMQConnectionFactory("redhat","redhat123!","tcp://10.44.248.57:61616");
		PooledConnectionFactory activemqpool = new PooledConnectionFactory(activemqfactory);
		JmsComponent activemq = new JmsComponent();
		activemq.setConnectionFactory(activemqpool);
		main.bind("activemq", activemq);
		
		MongoClient mongoBean = new MongoClient(new MongoClientURI("mongodb://astudy:astudy@10.44.249.125:27017,10.44.249.126:27017,10.44.249.127:27017"));
		main.bind("mongoBean", mongoBean);
		
		main.addRouteBuilder(new WeldBoschMongoRouteBuilder());
		
		main.run(args);

	}

}
