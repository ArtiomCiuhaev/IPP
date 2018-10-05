package IPP_Patterns.Prototype;

public class Germany extends Nation{
    public Germany(){
        nationType = "Germany";
    }

    @Override
    public void addNation() {
        System.out.println("Germany added into tree");
    }
}
