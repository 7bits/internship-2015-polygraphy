//package it.sevenbits.graphicartsindustry.config;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Properties;
//
//public class TestOption {
//    private final Logger logger = LoggerFactory.getLogger(TestOption.class);
//
//    public String getDomain() {
//        Properties prop = new Properties();
//        try {
//            InputStream inStream = getClass().getClassLoader().getResourceAsStream("application.yml");
//            prop.load(inStream);
//            inStream.close();
//        } catch (IOException e) {
//            //TODO:need to do something
//            logger.warn("Can't open file in common.properties");
//            e.printStackTrace();
//        }
//        String result = prop.getProperty("spring.domain");
//        if (result == null) {
//            result = prop.getProperty("polygraphy.7bits.it");
//        }
//        return result;
//    }
//}