package cocukadam;

public class Cooker {

    private int cookerCount = 0;
    private int cost;
    private final int manufactureRate;

    public Cooker(int cost, int manufactureRate) {
        this.cost = cost;
        this.manufactureRate = manufactureRate;
    }

    public void buyCooker() {
        cookerCount++;
        cost += Math.floor(cost * 10 / 100);
    }

    public int getCost() {
        return cost;
    }

    public int getCookerCount() {
        return cookerCount;
    }

    public int getManufactureRate() {
        return manufactureRate;
    }

    public int cook() {
        return cookerCount * manufactureRate;
    }

}
