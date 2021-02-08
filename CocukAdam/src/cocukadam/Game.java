package cocukadam;

public class Game {

    int demandRate = 50;
    int material = 10000;
    int money = 0;
    int price = 10;
    int currentCigKofte = 0;
    int manufacturedCigKofte = 0;
    int soldCigKofte = 0;
    int unitMaterialCost = 100;

    double lastManufacturedCount = 0;
    double lastManufacturedRate = 0;
    double lastManufacturedRateTs = System.nanoTime();

    int materialCost = 500;
    double materialCostLastUpdate = System.nanoTime();

    double autoGeneratorsLastGeneratedAt = System.nanoTime();

    AutoMetarialBuyer autoMetarialBuyer = AutoMetarialBuyer.getInstance();
    AutoGenerator gen = new AutoGenerator();

    public void makeCigKofte(int count) {
        if (canMakeCigKofte(count)) {
            currentCigKofte += count;
            manufacturedCigKofte += count;
            material -= unitMaterialCost * count;
        }
    }

    public void update() {
        if ((int) ((System.nanoTime() - autoGeneratorsLastGeneratedAt) / 1000000000) > 1) {
            makeCigKofte(gen.generateCigKofte());
            autoGeneratorsLastGeneratedAt = System.nanoTime();
        }

        if (autoMetarialBuyer.isCanBuy(material) && canBuyMaterial()) {
            buyMaterial();
        }

        if ((int) ((System.nanoTime() - materialCostLastUpdate) / 1000000000) > 10) {
            materialCost = (int) (Math.random() * 300 + 300);
            materialCostLastUpdate = System.nanoTime();
        }

        if ((int) ((System.nanoTime() - lastManufacturedRateTs) / 1000000000) > 5) {
            lastManufacturedRateTs = System.nanoTime();
            lastManufacturedRate = (manufacturedCigKofte
                    - lastManufacturedCount) / 10;
            lastManufacturedCount = manufacturedCigKofte;
        }

        updateDemand();

        if (Math.random() * 100 < demandRate && currentCigKofte > 0) {
            purchaseCigKofte();
        }
    }

    public void updateDemand() {
        double rate;
        if (price <= 40) {
            rate = 2 / Math.sqrt(price) * 100;
        } else {
            double maxRate = (2 / Math.sqrt(40)) * 100;
            rate = (maxRate * (60 - price)) / 20;
        }

        demandRate = (int) Math.max(0, rate);
    }

    public void purchaseCigKofte() {
        currentCigKofte -= 1;
        money += price;
    }

    public boolean canBuyErrandboy() {
        return getErrandBoyCost() <= money;
    }

    public boolean canBuyForeman() {
        return getForemanCost() <= money;
    }

    public boolean canBuyMaster() {
        return getMasterCost() <= money;
    }

    public boolean canBuyMaterial() {
        return money >= materialCost;
    }

    public boolean canBuyAutoBuyer() {
        return (manufacturedCigKofte > 10)
                && !autoMetarialBuyer.isActive()
                && (money >= autoMetarialBuyer.getCost());
    }

    public boolean canMakeCigKofte(int count) {
        return material >= unitMaterialCost * count;
    }

    public boolean candecreasPrice() {
        return price > 1;
    }

    public void buyMaterial() {
        materialCost += Math.floor(Math.random() * 20 + 10);
        materialCostLastUpdate = System.nanoTime();
        material += 10000;
        money -= materialCost;
    }

    public void buyErrandBoy() {
        gen.buyErrandBoy();
        money -= getErrandBoyCost();
    }

    public void buyForeman() {
        gen.buyForeman();
        money -= getForemanCost();
    }

    public void buyMaster() {
        gen.buyMaster();
        money -= getMasterCost();
    }

    public void buyAutoBuyer() {
        money -= autoMetarialBuyer.getCost();
        autoMetarialBuyer.activate();
    }

    public void increasePrice() {
        price += 1;
    }

    public void decreasePrice() {
        price -= 1;
    }

    public void startAutoBuyer() {
        autoMetarialBuyer.activate();
    }

    public void stopAutoBuyer() {
        autoMetarialBuyer.deactivate();
    }

    public int getErrandBoyCount() {
        return gen.getErrandBoy().getCookerCount();
    }

    public int getForemanCount() {
        return gen.getForeman().getCookerCount();
    }

    public int getMasterCount() {
        return gen.getMaster().getCookerCount();
    }

    public int getErrandBoyCost() {
        return gen.getErrandBoy().getCost();
    }

    public int getForemanCost() {
        return gen.getForeman().getCost();
    }

    public int getMasterCost() {
        return gen.getMaster().getCost();
    }

    int getAutoBuyerCost() {
        return autoMetarialBuyer.getCost();
    }

}
