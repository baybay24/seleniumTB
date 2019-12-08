package test;

import org.testng.annotations.*;

public class TestNg {
    @BeforeClass
    public void testBefore(){
        System.out.println("Before test NG");
    }

    @BeforeMethod
    public void methodBefore() {
        System.out.println("Before method");
    }
    @Test
    public void test(){
        System.out.println("test NG");
    }

    @AfterMethod
    public void methodAfter(){
        System.out.println("After Method");
    }

    @AfterClass
    public void testAfter(){
        System.out.println("After test NG");
    }

}
