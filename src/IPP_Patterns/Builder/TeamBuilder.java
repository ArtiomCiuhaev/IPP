package IPP_Patterns.Builder;

public abstract class TeamBuilder {
    protected TeamFighting team;

    public TeamFighting getTeam() {
        return team;
    }

    public void createNewTeam(){
        team = new TeamFighting();
    }

    public abstract void name();

    public abstract void amount();

    public abstract void accessory();

    public abstract void region();

}
