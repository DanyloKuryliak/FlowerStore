package flower.store;

public class Flower extends Item {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public Flower() {
        this.sepalLength = 0;
        this.color = FlowerColor.RED;
        this.price = 0;
        this.flowerType = FlowerType.ROSE;
    }

    public Flower(Flower flower) {
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
        this.price = flower.price;
        this.flowerType = flower.flowerType;
    }

    // Getters
    public double getSepalLength() {
        return sepalLength;
    }

    public double getPrice() {
        return this.price;
    }

    public FlowerType getFlowerType() {
        return flowerType;
    }

    public String getColor() {
        return color.toString();
    }

    public FlowerColor getFlowerColor() {
        return color;
    }

    // Setters
    public void setSepalLength(double sepalLength) {
        this.sepalLength = sepalLength;
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setFlowerType(FlowerType flowerType) {
        this.flowerType = flowerType;
    }
}
