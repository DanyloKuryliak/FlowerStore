package flower.store;

import org.junit.jupiter.api.*;

public class FlowerPackTest {
    private Flower flower;
    private FlowerPack flowerPack;

    @BeforeEach
    public void init() {
        flower = new Flower();
        flower.setPrice(10.0); // Set price to 10
        flowerPack = new FlowerPack(flower, 10);
    }

    @Test
    public void testPrice() {
        Assertions.assertEquals(100.0, flowerPack.getPrice());
    }

    @Test
    public void testAmount() {
        Assertions.assertEquals(10, flowerPack.getAmount());
    }

    @Test
    public void testFlower() {
        Flower packFlower = flowerPack.getFlower();
        Assertions.assertEquals(flower.getPrice(), packFlower.getPrice());
        Assertions.assertEquals(flower.getFlowerType(), packFlower.getFlowerType());
        Assertions.assertEquals(flower.getFlowerColor(), packFlower.getFlowerColor());
    }
}
