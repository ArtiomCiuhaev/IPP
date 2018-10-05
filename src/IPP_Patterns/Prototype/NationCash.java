package IPP_Patterns.Prototype;

import java.util.Hashtable;

public class NationCash {

    private static Hashtable<String, Nation> cachedNation = new Hashtable<String, Nation>();

    public static Nation getNation(String nationName){
        return (Nation) cachedNation.get(nationName).clone();

    }

    static {
        cachedNation.put("AmericanUnion", new AmericanUnion());
        cachedNation.put("SovietUnion", new SovietUnion());
        cachedNation.put("Germany", new Germany());
    }

}
