package IPP_Patterns.Abstract_factory;

public class HeavyTanksFactory extends AbstractFactory{
    @Override
    public TankDestroyers createTankDestroyers() {
        return new SU128();
    }

    @Override
    public HeavyTanks createHeavyTanks() {
        return new IS_4();
    }
}
