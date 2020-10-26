package Logger;

import org.slf4j.LoggerFactory;

public class MyLogger {

    // https://javarush.ru/groups/posts/2388-logirovanie-chto-kak-gde-i-chem

    public static void main(String[] args) {

        org.slf4j.Logger logger = LoggerFactory.getLogger(MyLogger.class);

        logger.trace("trace == trace");
        logger.debug("debug == debug");
        logger.info("info == info");
        logger.warn("warn == warn");
        logger.error("error == error");

    }
}
