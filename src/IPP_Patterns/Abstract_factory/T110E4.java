package IPP_Patterns.Abstract_factory;

public class T110E4 implements TankDestroyers {

    @Override
    public void getLandscape(String landscape) {
        System.out.println("T110E4 - better to use in " + landscape);
    }
}
