## Log Transport Headers in WSO2 APIM

This Mediator is used to log all the Transport Headers in WSO2 APIM.

Tested with APIM 3.2.0 .

## How to use this?

Place the jar [org.sample.logTransportHeaders-1.0.0.jar](https://github.com/vikumkbv/Transport-HEADERS-Logging-Mediator/raw/master/log-transport-headers-master/target/org.sample.logTransportHeaders-1.0.0.jar) in APIM_HOME/repository/components/lib
directory.

Add the following config to log4j.properties file to enable INFO level logs for this mediator.

`logger.org.sample.LogTransportHeaders.name = org.sample.LogTransportHeaders
logger.org.sample.LogTransportHeaders.level = INFO`

And also add this to the loggers in log4j.properties file
`org.sample.LogTransportHeaders`

Example: `loggers = org.sample.LogTransportHeaders`

Use this class mediator as follows wherever needed. then it will log all the transport headers.

`<class name="org.sample.LogTransportHeaders"/>`
