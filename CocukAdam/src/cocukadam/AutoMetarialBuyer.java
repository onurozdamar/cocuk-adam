package cocukadam;

public class AutoMetarialBuyer {

    private static AutoMetarialBuyer autoMetarialBuyer;

    private boolean active = false;
    private final int cost = 150;

    private AutoMetarialBuyer() {

    }

    public static AutoMetarialBuyer getInstance() {
        if (autoMetarialBuyer == null) {
            autoMetarialBuyer = new AutoMetarialBuyer();
        }
        return autoMetarialBuyer;
    }

    public boolean isCanBuy(int material) {
        return active && material <= 500;
    }

    public int getCost() {
        return cost;
    }

    void activate() {
        active = true;
    }

    void deactivate() {
        active = false;
    }

    boolean isActive() {
        return active;
    }
}
