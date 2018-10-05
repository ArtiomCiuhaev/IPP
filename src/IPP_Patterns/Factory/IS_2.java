package IPP_Patterns.Factory;

public class IS_2 implements Tank{
    @Override
    public void characteristics(int numberOfPilots , String damage) {
        System.out.println("Tank IS-2 has " + numberOfPilots + " pilots and weapon with " + damage);
    }
}
