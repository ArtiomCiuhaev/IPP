package IPP_Patterns.Prototype;

public abstract class Nation implements Cloneable{
    protected String nationType;

    public abstract void addNation();

    public String getNationType() {
        return nationType;
    }

    public void setNationType(String nationType) {
        this.nationType = nationType;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
            } catch (CloneNotSupportedException e){
            e.printStackTrace();
            }
        return clone;
    }
}
