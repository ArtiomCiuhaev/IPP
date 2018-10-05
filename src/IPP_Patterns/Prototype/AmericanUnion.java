package IPP_Patterns.Prototype;

public class AmericanUnion extends Nation {

    public AmericanUnion(){
        nationType = "AmericanUnion";
    }

    @Override
    public void addNation() {
        System.out.println("AmericanUnion added into tree");
    }
}
