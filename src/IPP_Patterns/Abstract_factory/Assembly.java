package IPP_Patterns.Abstract_factory;

public class Assembly {
    private static AbstractFactory factory = null;

    public static AbstractFactory getAssembly(String type) {
       switch (type) {
            case "HeavyTanks": return new HeavyTanksFactory();
            case "TankDestroyers": return new TankDestroyersFactory();
            default: return null;
        }
    }
}
