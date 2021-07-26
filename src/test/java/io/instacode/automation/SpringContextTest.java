package io.instacode.automation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.instacode.automation.spring.cloud.zipkin.ZipkinApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ZipkinApplication.class)
public class SpringContextTest {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}
