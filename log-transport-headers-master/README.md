## Log Transport Headers in WSO2 EI

This Mediator is used to log all the Transport Headers in WSO2 EI.
Tested with EI 6.5.0-m6 and ESB 5.0.0 .

## How to use this?

Place the jar [org.sample.logTransportHeaders-1.0.0.jar](https://github.com/Nirothipan/log-transport-headers/raw/master/target/org.sample.logTransportHeaders-1.0.0.jar) in EI_HOME/lib or ESB_HOME/repository/components/lib
directory.

Add the following config to log4j.properties file to enable INFO level logs for this mediator.

`log4j.logger.org.sample.LogTransportHeaders=INFO`

Use this class mediator as follows wherever needed in you API or Proxy or etc then it will log all the transport 
headers.

`<class name="org.sample.LogTransportHeaders"/>`
