package IPP_Patterns;

import IPP_Patterns.Abstract_factory.AbstractFactory;
import IPP_Patterns.Abstract_factory.Assembly;
import IPP_Patterns.Abstract_factory.HeavyTanks;
import IPP_Patterns.Abstract_factory.TankDestroyers;
import IPP_Patterns.Builder.*;
import IPP_Patterns.Factory.Factory;
import IPP_Patterns.Factory.Tank;
import IPP_Patterns.Prototype.NationCash;
import IPP_Patterns.Singleton.TankID;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class Customer {
    public static void main(String[] args){

        System.out.println("\n #FACTORY");
        Tank tank = Factory.getCharacteristics("IS-2");
        tank.characteristics(6, "150-200");
        tank = Factory.getCharacteristics("IS-3");
        tank.characteristics(5, "180-220");
        tank = Factory.getCharacteristics("IS-7");
        tank.characteristics(5, "190-250");

        System.out.println("\n #ABSTRACT_FACTORY");
        AbstractFactory factory1 = Assembly.getAssembly("HeavyTanks");
        HeavyTanks tt1 = factory1.createHeavyTanks();
        tt1.getTerrain("city");
        TankDestroyers tt2 = factory1.createTankDestroyers();
        tt2.getLandscape("vilage");
        AbstractFactory factory2 = Assembly.getAssembly("TankDestroyers");
        HeavyTanks pt1 = factory2.createHeavyTanks();
        pt1.getTerrain("forest");
        TankDestroyers pt2 = factory2.createTankDestroyers();
        pt2.getLandscape("bushes");

        System.out.println("\n #SINGLETON");
        TankID id = TankID.getInstance();
        id.show();

        System.out.println("\n #BUILDER");
        MatchMaker matchMaker = new MatchMaker();
        TeamBuilder clanWarsBuilder = new ClanWarsBuilder();
        TeamBuilder tournamentsBuilder = new TournamentsBuilder();

        matchMaker.setTeamBuilder(tournamentsBuilder);
        matchMaker.constructTeam();
        TeamFighting teamFighting = matchMaker.getTeamBuilder();
        teamFighting.printTeam();

        matchMaker.setTeamBuilder(clanWarsBuilder);
        matchMaker.constructTeam();
        TeamFighting teamFighting2 = matchMaker.getTeamBuilder();
        teamFighting2.printTeam();

        System.out.println("\n #PRTOTYPE");
        NationCash.getNation("AmericanUnion").addNation();
        NationCash.getNation("SovietUnion").addNation();
        NationCash.getNation("Germany").addNation();

    }
}
