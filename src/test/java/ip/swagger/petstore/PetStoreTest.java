package ip.swagger.petstore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PetStoreTest {

    @Test
    @DisplayName("Basic Test")
    void basicTest(){
        System.out.println("This is a very basic test");
        Assertions.fail();
        Assertions.assertTrue(false);
    }
}
