package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNg {
    @BeforeClass
    public void testBefore(){
        System.out.println("Before test NG");
    }

    @Test
    public void test(){
        System.out.println("test NG");
    }
}
