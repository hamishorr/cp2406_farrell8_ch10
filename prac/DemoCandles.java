public class DemoCandles {

    public static void main(String[] args){

        ScentedCandle candle = new ScentedCandle("Orange", 6,"Citrus");
        System.out.println(candle.getColour() + " candle, height " + candle.getHeight() +
                " inches is $" + candle.getPrice());

    }

}
