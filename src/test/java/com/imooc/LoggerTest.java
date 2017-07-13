package com.imooc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//import java.util.logging.Logger;

/**
 * Created by 0500078 on 2017-07-13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LoggerTest {

    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1(){
        logger.debug("debug.......");
        logger.info("info.......");
        logger.error("error.......");
    }
}
