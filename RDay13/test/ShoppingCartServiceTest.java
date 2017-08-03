import com.cdk.shopping.Product;
import com.cdk.shopping.ShoppingCartService;
import org.junit.Test;
import com.cdk.exception.ItemNotFoundException;
import org.junit.After;

import static org.junit.Assert.*;
import org.junit.Before;

/**
 * Created by sahoos on 8/2/2017.
 */
public class ShoppingCartServiceTest {

    ShoppingCartService shoppingCartService = null;

    @Before
    public void init() {
        shoppingCartService = new ShoppingCartService();
        System.out.println("Inside init()");
    }

    @After
    public void clean() {
        shoppingCartService = null;
        System.out.println("Inside clean()");
    }

    @Test
    public void testAddItem() {
        shoppingCartService.addItem( new Product(5,"Pen",25.00,5));
        shoppingCartService.addItem( new Product(6,"Pencil",5.00,2));
        assertEquals(7,shoppingCartService.countItems());
    }

    @Test(expected = ItemNotFoundException.class)
    public void testIsItemRemoved() throws ItemNotFoundException{
        shoppingCartService.removeItem(5);
    }

    @Test
    public void testTotalPrice() {
        assertEquals(135, shoppingCartService.totalPrice());
    }
}
