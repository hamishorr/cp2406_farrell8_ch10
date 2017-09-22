/**
 * Created by jc325134 on 22/09/17.
 */
public class RaceHorse extends Horse{

    int races;


    public RaceHorse(){this(3);}

    public RaceHorse(int races)
    {
        //super calls constructor from parent class
        super("kkk","ll",1);
        this.races = races;

    }


}
