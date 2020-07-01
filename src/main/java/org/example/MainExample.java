package org.example;

import com.studerw.tda.client.HttpTdaClient;
import com.studerw.tda.client.TdaClient;
import com.studerw.tda.model.account.Order;
import com.studerw.tda.model.quote.EquityQuote;
import com.studerw.tda.model.quote.Quote;
import java.util.List;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainExample {
  private static final Logger LOGGER = LoggerFactory.getLogger(MainExample.class);

  public static void main(String[] args) {
    Properties props = new Properties();
    props.setProperty("tda.client_id", "...");
    props.setProperty("tda.token.refresh", "...");

    TdaClient tdaClient = new HttpTdaClient(props);

    Quote quote = tdaClient.fetchQuote("MSFT");
    EquityQuote equityQuote = (EquityQuote) quote;
    LOGGER.debug("Current price of MSFT: {}", equityQuote.getAskPrice());

    final List<Order> orders = tdaClient.fetchOrders();
    orders.forEach(order -> LOGGER.debug("{}", order));

    System.exit(0);
  }

}
