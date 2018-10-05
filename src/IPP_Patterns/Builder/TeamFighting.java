package IPP_Patterns.Builder;

public class TeamFighting {
    private String name;
    private int amount;
    private String accessory;
    private String region;

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setAccesory(String accesory) {
        this.accessory = accesory;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public String getAccesory() {
        return accessory;
    }

    public String getRegion() {
        return region;
    }

    public void printTeam() {
        System.out.println(name + "\n" +
                " Amount: " + amount + "\n" +
                " Accessory: " + accessory + "\n" +
                " Region: " + region + "\n");
    }
}
