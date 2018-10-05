package IPP_Patterns.Factory;

public class Factory {
    public static Tank getCharacteristics(String typeOfTank) {
        switch (typeOfTank){
            case "IS-2" : return new IS_2();
            case "IS-3" : return new IS_3();
            case "IS-7" : return new IS_7();
            default: return  null;
        }
    }
}
