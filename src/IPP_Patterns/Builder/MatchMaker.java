package IPP_Patterns.Builder;

public class MatchMaker {
    private TeamBuilder teamBuilder;

    public void setTeamBuilder(TeamBuilder teamBuilder){
        this.teamBuilder =  teamBuilder;
    }

    public TeamFighting getTeamBuilder() {
        return teamBuilder.getTeam();
    }

    public void constructTeam(){
        teamBuilder.createNewTeam();
        teamBuilder.name();
        teamBuilder.amount();
        teamBuilder.accessory();
        teamBuilder.region();
    }
}
