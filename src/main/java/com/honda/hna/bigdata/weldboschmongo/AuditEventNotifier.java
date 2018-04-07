package com.honda.hna.bigdata.weldboschmongo;

import java.util.Date;
import java.util.EventObject;

import org.apache.camel.Exchange;
import org.apache.camel.management.event.ExchangeCompletedEvent;
import org.apache.camel.management.event.ExchangeSentEvent;
import org.apache.camel.support.EventNotifierSupport;
import org.springframework.stereotype.Component;

@Component
public class AuditEventNotifier extends EventNotifierSupport {

  @Override
  public void notify(EventObject event) throws Exception {
    if (event instanceof ExchangeSentEvent) {
      ExchangeSentEvent sent = (ExchangeSentEvent) event;
      log.info(">>> Took " + sent.getTimeTaken() + " millis to send to external system : " + sent.getEndpoint());
    }

    if (event instanceof ExchangeCompletedEvent) {

      ExchangeCompletedEvent exchangeCompletedEvent = (ExchangeCompletedEvent) event;
      Exchange exchange = exchangeCompletedEvent.getExchange();
      String routeId = exchange.getFromRouteId();
      Date created = ((ExchangeCompletedEvent) event).getExchange().getProperty(Exchange.CREATED_TIMESTAMP, Date.class);
      // calculate elapsed time
      Date now = new Date();
      long elapsed = now.getTime() - created.getTime();
      String msg = ""; //exchange.getIn().getBody().toString(); //This really slows down the throughput
      log.info(">>> Took " + elapsed + " millis for the exchange on the route : " + routeId + " for end point " + exchange.getFromEndpoint().toString() + " msg " + msg);
    }
  }

  @Override
  public boolean isEnabled(EventObject event) {
    return true;
  }

  @Override
  protected void doStart() throws Exception {
    // filter out unwanted events
    setIgnoreCamelContextEvents(true);
    setIgnoreServiceEvents(true);
    setIgnoreRouteEvents(true);
    setIgnoreExchangeCreatedEvent(true);
    setIgnoreExchangeCompletedEvent(false);
    setIgnoreExchangeFailedEvents(true);
    setIgnoreExchangeRedeliveryEvents(true);
    setIgnoreExchangeSentEvents(true);
  }

  @Override
  protected void doStop() throws Exception {
    // noop
  }
}
