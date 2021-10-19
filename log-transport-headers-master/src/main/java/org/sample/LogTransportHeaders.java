package org.sample;

import org.apache.synapse.MessageContext;
import org.apache.synapse.core.axis2.Axis2MessageContext;
import org.apache.synapse.mediators.AbstractMediator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

/**
 * This class is used to log all the transport headers in WSO2 ESB / EI.
 */


public class LogTransportHeaders extends AbstractMediator {

    //private static final Log log = LogFactory.getLog(LogTransportHeaders.class);
    private static final Logger log = LogManager.getLogger(LogTransportHeaders.class);

    public boolean mediate(MessageContext msgContext) {

        try {
            Map headers = (Map) ((Axis2MessageContext) msgContext).getAxis2MessageContext()
                    .getProperty(org.apache.axis2.context.MessageContext.TRANSPORT_HEADERS);

            if (headers == null || headers.isEmpty()) {
                log.info("No Transport Headers Found");
                return true;
            }

            log.info("=======================================================");
            System.out.println("=======================================================");

            for (Object name : headers.keySet()) {
                String key = name.toString();
                String value = headers.get(name).toString();
                log.info(key + " " + value);
                System.out.println(key + " " + value);
            }

            log.info("=======================================================");
            System.out.println("=======================================================");

        } catch (Exception e) {
            log.error("Error while logging TRP Headers", e);
            return false;
        }
        return true;
    }
}
