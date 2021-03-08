package ip.swagger.petstore;

import org.junit.Assert;
import org.junit.Test;


public class PetStoreTest {

    @Test
    void basicTest(){
        System.out.println("This is a very basic test");
        Assert.assertTrue(true);
    }

    @Test
    void basicTest2(){
        System.out.println("This is a second very basic test");
        Assert.assertTrue(false);
    }
}
