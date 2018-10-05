package IPP_Patterns.Abstract_factory;

public class TankDestroyersFactory extends AbstractFactory{
    @Override
    public TankDestroyers createTankDestroyers() {
        return new T110E4();
    }

    @Override
    public HeavyTanks createHeavyTanks() {
        return new T110();
    }
}
