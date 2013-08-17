package example;


import org.junit.Test;

public class HelloIT {

    @Test
    public void test() {
        new HelloWorld().notCovered();
    }

}