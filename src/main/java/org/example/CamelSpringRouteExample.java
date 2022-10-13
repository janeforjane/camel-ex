package org.example;

import org.apache.camel.spring.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CamelSpringRouteExample {


    private static final Logger log = LoggerFactory.getLogger(CamelSpringRouteExample.class);

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.setApplicationContextUri("META-INF/spring/camel-context.xml");
        main.enableHangupSupport();
        main.run();
    }


}
