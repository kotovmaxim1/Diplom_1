package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunTest {

    String name;
    float price;

    public BunTest(String name, float price){
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters
    public static Object[][] ingredientData(){
        return new Object[][]{
                {"Краторная булка", 1255.0F},
                {"Флюорисцентная булка", 988.0F}
        };
    }

    @Test
    public void getNameTest(){
        Bun bun = new Bun(name, price);
        assertEquals(name, bun.getName());
    }

    @Test
    public void getPriceTest(){
        Bun bun = new Bun(name, price);
        assertEquals(price, bun.getPrice(), 0);
    }
}