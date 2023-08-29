
package bussiness.tests;

import bussiness.services.ProductService;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author paula
 */
public class ProductTests {
    
    private static ProductService ps;
    private static HashMap<String, Double> products;
    private static String product1, product2, product3, product4;
    private static Double price1, price2, price3, price4;
    
    public ProductTests() {
    }
    
    @Before
    public void setUp() {
        product1 = "Liguitas";
        product2 = "Liguotas";
        product3 = "Pinzas bi";
        product4 = "Pinzas";
        price1 = 15.0;
        price2 = 20.0;
        price3 = 20.0;
        price4 = 20.0;
        products = new HashMap<>();
        products.put(product1, price1);
        products.put(product2, price2);
        products.put(product3, price3);
        ps = new ProductService(products);
    }
    
    @After
    public void tearDown() {
        product1 = product2 = product3 = product4 = null;
        price1 = price2 = price3 = price4 = null;
        products = null;
        ps = null;
    }

    @Test
    public void shouldLoadUpdateAProduct(){
        //new
        ps.insertProduct(product4, price4);
        assertTrue(ps.getProducts().containsKey(product4));
        assertTrue(ps.getProducts().containsValue(price4));
        //update
        ps.insertProduct(product1, 10.0);
        assertEquals(10.0,ps.getProducts().get(product1),0);
    }
    
    @Test
    public void shouldDeleteProduct(){
        ps.removeProduct(product2);
        assertNull(ps.getProducts().get(product2));
    }
}
