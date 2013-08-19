package example;

import org.junit.Test;

public class HelloWorldNestedBUnitTest {

    @Test
    public void testDoSomething(){
        HelloWorldNestedB a = new HelloWorldNestedB();
        a.doSomething();
    }
}
