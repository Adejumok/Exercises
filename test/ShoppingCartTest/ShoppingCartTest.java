package ShoppingCartTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ShoppingCartTest {
    ShoppingCart.ShoppingCartMain shoppingCart;

    @BeforeEach
    public void setUp(){
        shoppingCart=new ShoppingCart.ShoppingCartMain();

    }

    @Test
    public void testThatItemArrayExist(){
        assertNotNull(shoppingCart);
    }
}
