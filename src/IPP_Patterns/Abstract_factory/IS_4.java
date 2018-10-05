package IPP_Patterns.Abstract_factory;

public class IS_4 implements HeavyTanks {

    @Override
    public void getTerrain(String terrain) {
        System.out.println(" IS-4 - better to use in " + terrain);
    }
}
