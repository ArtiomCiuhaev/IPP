package IPP_Patterns.Abstract_factory;

public class SU128 implements TankDestroyers {

    @Override
    public void getLandscape(String landscape) {
        System.out.println(" SU128 - better to use in " + landscape);
    }
}
