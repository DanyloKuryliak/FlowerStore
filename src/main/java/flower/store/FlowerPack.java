package flower.store;

public class FlowerPack extends Item {
    private Flower flower;
    private int amount;

    public FlowerPack(Flower flower, int amount) {
        this.flower = new Flower(flower);
        this.amount = amount;
    }

    // Getters
    public Flower getFlower() {
        return flower;
    }

    public int getAmount() {
        return amount;
    }

    // Setters
    public void setFlower(Flower flower) {
        this.flower = flower;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public double getPrice() {
        return flower.getPrice() * amount;
    }
}