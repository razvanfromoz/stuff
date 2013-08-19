package example;

import org.junit.Test;

public class HelloWorldUnitTest {
    
	@Test
    public void test() {

        System.out.println("my.sonar.argline="+System.getProperty("my.sonar.argline"));

        new HelloWorld().coveredByUnitTest();
    }
	
}
