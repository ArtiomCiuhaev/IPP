package IPP_Patterns.Abstract_factory;

public class T110 implements HeavyTanks{

    @Override
    public void getTerrain(String terrain) {
        System.out.println(" T110 - better to use in " + terrain);
    }
}
