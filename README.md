# tda-client-example
Simple Java & Maven example of TDA Client

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
[INFO]
[INFO] -------------------< org.example:tda-client-example >-------------------
[INFO] Building tda-client-example 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- exec-maven-plugin:3.0.0:java (default-cli) @ tda-client-example ---
2021-01-13 00:19:24.199 [org.example.MainExample.main()] DEBUG org.example.MainExample - Current price of MSFT: 215.14
```
