package mypackage;

import org.apache.felix.dm.annotation.api.Component;
import org.apache.felix.dm.annotation.api.Inject;
import org.apache.felix.dm.annotation.api.Start;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class Test {

    private static final Logger LOGGER = LoggerFactory.getLogger(Test.class.getName());

    @Inject
    private static BundleContext bundleContext;

    @Start
    private void start() {
        LOGGER.debug("Some logging for testing!");

        String config = bundleContext.getProperty("logback.configurationFile");
        System.out.println("config = " + config);
    }
}
