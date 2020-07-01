package org.example;

import com.studerw.tda.client.HttpTdaClient;
import com.studerw.tda.client.TdaClient;
import com.studerw.tda.model.quote.EquityQuote;
import com.studerw.tda.model.quote.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainExample {
  private static final Logger LOGGER = LoggerFactory.getLogger(MainExample.class);

  public static void main(String[] args) {
    TdaClient client = new HttpTdaClient();

    Quote quote = client.fetchQuote("MSFT");
    EquityQuote equityQuote = (EquityQuote) quote;
    LOGGER.debug("Current price of MSFT: {}", equityQuote.getAskPrice());

    System.exit(0);
  }

}
