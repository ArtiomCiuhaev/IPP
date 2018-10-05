package IPP_Patterns.Builder;

public class ClanWarsBuilder extends TeamBuilder{

    @Override
    public void name() {
        team.setName(" Team2 ");
    }

    @Override
    public void amount() {
        team.setAmount(5);
    }

    @Override
    public void accessory() {
        team.setAccesory("Some accessories");
    }

    @Override
    public void region() {
        team.setRegion("En");
    }
}
