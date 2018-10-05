package IPP_Patterns.Singleton;

public class TankID {
    private static TankID id = new TankID();

    private TankID() {
    }

    public static TankID getInstance(){
        return id;
    }

    public static void show(){
        System.out.println("There should be id");
    }
}
