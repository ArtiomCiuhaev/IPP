package IPP_Patterns.Builder;

public class TournamentsBuilder extends TeamBuilder{

    @Override
    public void name() {
        team.setName(" Team1 ");
    }

    @Override
    public void amount() {
        team.setAmount(3);
    }

    @Override
    public void accessory() {
        team.setAccesory("Some accessories");
    }

    @Override
    public void region() {
        team.setRegion("Ru");
    }
}
