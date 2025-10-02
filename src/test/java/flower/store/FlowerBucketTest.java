package flower.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FlowerBucketTest {
    private FlowerPack flowerPack;
    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        Flower flower = new Flower();
        flower.setPrice(10.0); // Set price to 10
        flowerPack = new FlowerPack(flower, 10);
        flowerBucket = new FlowerBucket();
        flowerBucket.addFlowerPack(flowerPack);
    }

    @Test
    public void testPrice() {
        Assertions.assertEquals(100.0, flowerBucket.getPrice());
    }

    @Test
    public void testFlowerPack() {
        Assertions.assertEquals(flowerPack, flowerBucket.getFlowerPacks().get(0));
        Assertions.assertEquals(flowerPack.getFlower(), flowerBucket.getFlowerPacks().get(0).getFlower());
        Assertions.assertEquals(flowerPack.getAmount(), flowerBucket.getFlowerPacks().get(0).getAmount());
    }
}
