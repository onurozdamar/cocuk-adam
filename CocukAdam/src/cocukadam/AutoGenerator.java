package cocukadam;

public class AutoGenerator {

    private final Cooker errandBoy; // 100 1
    private final Cooker foreman; //500 6
    private final Cooker master;// 2000 15

    public AutoGenerator() {
        errandBoy = new Cooker(100, 1);
        foreman = new Cooker(500, 6);
        master = new Cooker(2000, 15);
    }

    public int generateCigKofte() {
        return errandBoy.cook() + foreman.cook() + master.cook();
    }

    public void buyErrandBoy() {
        errandBoy.buyCooker();
    }

    public void buyForeman() {
        foreman.buyCooker();
    }

    public void buyMaster() {
        master.buyCooker();
    }

    public Cooker getErrandBoy() {
        return errandBoy;
    }

    public Cooker getForeman() {
        return foreman;
    }

    public Cooker getMaster() {
        return master;
    }
    

}
