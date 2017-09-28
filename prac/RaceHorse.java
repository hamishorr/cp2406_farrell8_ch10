/**
 * Created by jc325134 on 22/09/17.
 */
public class RaceHorse extends Horse{

    private int races;


    public RaceHorse(){this("noName", "noColour", 9999,0);}

    RaceHorse(String name, String colour, int birthYear, int races)
    {
        //super calls constructor from parent class
        super(name, colour, birthYear);
        this.races = races;

    }

    public int getRaces() {
        return races;
    }

    public void setRaces(int races) {
        this.races = races;
    }
}
