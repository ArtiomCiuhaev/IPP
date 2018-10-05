package IPP_Patterns.Prototype;

public class SovietUnion extends Nation {

    public SovietUnion(){
        nationType = "SovietUnion";
    }

    @Override
    public void addNation() {
        System.out.println("SovietUnion added into tree");
    }
}
