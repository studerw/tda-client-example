# tda-client-example
Simple Java and Maven example of TDA Client.

`git clone https://github.com/studerw/tda-client-example.git`

Add your client id (customer key) and refresh token to the `src/main/resources/tda-api.properties` file.

Make sure you then add this file to `.gitignore` so you don't accidentally check in sensitive data
to a public repository.

`echo 'src/main/resources/tda-api.properties' >> .gitignore` 

## To Build

`mvn clean install`

## To Run
Run the `MainExample` class in your IDE. Or from the command line:

`mvn exec:java -Dexec.cleanupDaemonThreads=false`

On Windows, you'll probably have to add quotes to the `-Dexec...`.

Depending on how you've configured the `logback.xml` file in `src/main/resources`,
you'll end up with as little output as the following:

```shell
user@ubuntu:~/workspace/github/tda-client-example$ mvn exec:java -Dexec.cleanupDaemonThreads=false
[INFO] Scanning for projects...
...

DEBUG 2023-04-16 18:06:06.597 org.example.MainExample - Current price of MSFT: 286.72
```

## Errors
You  may get an authentication error, e.g: 

```
...
--- exec-maven-plugin:3.0.0:java (default-cli) @ tda-client-example ---
2021-05-16 11:24:51.725 [org.example.MainExample.main()] ERROR com.studerw.tda.client.OauthInterceptor - Failed to get auth token using refresh token: 400 okhttp3.internal.http.RealResponseBody@68498ae3
[WARNING]
java.lang.IllegalStateException: Failed to get auth token using current refresh token
    at com.studerw.tda.client.OauthInterceptor.intercept (OauthInterceptor.java:60)
    at okhttp3.internal.http.RealInterceptorChain.proceed (RealInterceptorChain.java:142)
    at okhttp3.internal.http.RealInterceptorChain.proceed (RealInterceptorChain.java:117)
    at okhttp3.RealCall.getResponseWithInterceptorChain (RealCall.java:229)
    at okhttp3.RealCall.execute (RealCall.java:81)
    at com.studerw.tda.client.HttpTdaClient.fetchQuotes (HttpTdaClient.java:237)
    at com.studerw.tda.client.HttpTdaClient.fetchQuote (HttpTdaClient.java:247)
    at org.example.MainExample.main (MainExample.java:16)
    at org.codehaus.mojo.exec.ExecJavaMojo$1.run (ExecJavaMojo.java:254)
    at java.lang.Thread.run (Thread.java:748)
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.673 s
[INFO] Finished at: 2021-05-16T11:24:51-04:00

....

```

If you see this, it means you've got an expired or otherwise incorrect OAUTH token. 
Take a look at the [Creating a TDA Refresh Token](https://github.com/studerw/td-ameritrade-client/wiki/Create-a-TDA-Refresh-Token) for more information.

