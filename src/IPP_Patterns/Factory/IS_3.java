package IPP_Patterns.Factory;

public class IS_3 implements Tank {
    @Override
    public void characteristics(int numberOfPilots , String damage) {
        System.out.println("Tank IS-3 has " + numberOfPilots + " pilots and weapon with " + damage);
    }
}
