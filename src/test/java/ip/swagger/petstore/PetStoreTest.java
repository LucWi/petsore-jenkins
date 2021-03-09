package ip.swagger.petstore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PetStoreTest {

    @Test
    @DisplayName("Basic Test")
    void basicTest() {
        System.out.println("This is a very basic test");
        Assertions.assertTrue(true);

    }

    @Test
    @DisplayName("Basic failing Test")
    void basicFailingTest() {
        System.out.println("This is a very basic failing test");
        Assertions.assertTrue(false);
    }
}
