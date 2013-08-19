package example;

import org.junit.Test;

public class HelloWorldIntegrationTest {

    @Test
    public void test() {
        System.out.println("my.sonar.argline="+System.getProperty("my.sonar.argline"));
        new HelloWorld().coveredByIntegrationTest();
    }
	
}
