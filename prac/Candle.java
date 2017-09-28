public class Candle {

    private String colour;
    private int height;
    private double price;

    public Candle(){this("white", 2, 4.0);}

    public Candle(String colour, int height, double price){
        this.colour = colour;
        this.height = height;
        this.price = 2*this.height;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getPrice() {
        return price;
    }

}
