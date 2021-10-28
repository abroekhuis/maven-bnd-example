package mypackage;

import org.apache.felix.dm.annotation.api.Component;
import org.apache.felix.dm.annotation.api.Start;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class Test {

    private static Logger LOGGER = LoggerFactory.getLogger(Test.class.getName());

    @Start
    private void start() {
        LOGGER.debug("Some logging for testing!");
    }
}
