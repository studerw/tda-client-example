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


