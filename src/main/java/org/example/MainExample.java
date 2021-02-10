package org.example;

import com.studerw.tda.client.HttpTdaClient;
import com.studerw.tda.client.TdaClient;
import com.studerw.tda.model.option.OptionChain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainExample {
  private static final Logger LOGGER = LoggerFactory.getLogger(MainExample.class);

  public static void main(String[] args) {
    TdaClient client = new HttpTdaClient();

    final OptionChain ostk = client.getOptionChain("OSTK");
    LOGGER.debug("{}", ostk);

    System.exit(0);
  }

}
