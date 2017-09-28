public class ScentedCandle extends Candle{

    private String scent;

    public ScentedCandle(){this("white", 6,"vanilla");}

    public ScentedCandle(String colour, int height, String scent){
        super(colour,height,3*height);
        this.scent = scent;

    }


}
