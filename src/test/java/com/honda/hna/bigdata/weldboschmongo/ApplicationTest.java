package com.honda.hna.bigdata.weldboschmongo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.camel.CamelContext;
import org.apache.camel.EndpointInject;
import org.apache.camel.builder.AdviceWithRouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.model.ModelCamelContext;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ApplicationTest {
  
  @LocalServerPort
  private int port;
  
  @Autowired
  private CamelContext camelContext;
  
  @EndpointInject(uri = "mock:mongodb")
  private MockEndpoint mongodb;
  
  private static final AtomicBoolean adviced = new AtomicBoolean(false);
  
  @BeforeClass
  public static void init() throws Exception {
  }
  
  @Before
  public void adviceRoutes() throws Exception {
    if (!adviced.get()) {
      camelContext.getRouteDefinition("sim").adviceWith((ModelCamelContext) camelContext, new AdviceWithRouteBuilder() {
        @Override
        public void configure() throws Exception {
          weaveByToString("To\\[jms\\:.*")
            .replace()
              .to("direct:weldBoschIngest")
          ;
        }
      });
      camelContext.getRouteDefinition("weldBoschIngest").adviceWith((ModelCamelContext) camelContext, new AdviceWithRouteBuilder() {
        @Override
        public void configure() throws Exception {
          replaceFromWith("direct:weldBoschIngest");
          weaveByToString("To\\[mongodb\\:.*")
            .replace()
              .to("mock:mongodb")
          ;
        }
      });
      adviced.set(true);
    }
  }
  
  @Test
  public void test() throws Exception {
    
    mongodb.expectedMessageCount(5);
    MockEndpoint.assertWait(30, TimeUnit.SECONDS, mongodb);
  }
}
