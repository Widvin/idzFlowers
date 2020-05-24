package by.gsu.pms;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public abstract class Flowers {

    public int freshness;
    private double stemLength;
    private double price;

    Flowers(int freshness, double stemLength, double price) {
        this.freshness = freshness;
        this.stemLength = stemLength;
        this.price = price;
    }

    Flowers() {
    }

    @Override
    public String toString() {
        String day = " day";
        if (freshness > 1) {
            day = " days";
        }
        return "This flower freshness is " + freshness + day + ", stem length is " + stemLength + " cm., price: " + price;
    }

    double getFreshness() {

        return freshness;
    }

    public double getStemLength() {
        return stemLength;
    }

    public double getPrice() {
        return price;
    }

    void setFreshness(int freshness) {

        this.freshness = freshness;
    }

    void setStemLength(double stemLength) {

        this.stemLength = stemLength;
    }

    void setPrice(double price) {

        this.price = price;
    }

    public static class Rose extends Flowers {
        Rose(double freshness, double stemLength, double price) {
            super((int) freshness, stemLength, price);
        }

        public Rose() {
            super(4, 13.4, 3);
        }

        @Override
        public String toString() {
            String day = " day";
            if (getFreshness() > 1) {
                day = " days";
            }
            return "This Rose freshness is " + getFreshness() + day + ", stem length is " + getStemLength() + " cm., " +
                    "price:" + " $" + getPrice() + ". \n";
        }
    }

    public static class Lilac extends Flowers {

        Lilac(int freshness, double stemLength, double price) {
            super(freshness, stemLength, price);
        }

        public Lilac() {
            super(4, 10, 3);
        }

        @Override
        public String toString(){
            String day = " day";
            if(getFreshness() > 1){
                day = " days";
            }
            return "This lilac freshness is " + getFreshness() + day + ", stem length is " + getStemLength() + " cm., " +
                    "price:" + " $" + getPrice() + ". \n";
        }
    }

    public static class Poppy extends Flowers {

        Poppy(int freshness, double stemLength, double price)
        {
            super(freshness, stemLength, price);
        }

        public Poppy() {
            super(4, 12.5, 1);
        }

        @Override
        public String toString() {
            String day = " day";
            if (getFreshness() > 1) {
                day = " days";
            }
            return "This poppy freshness is " + getFreshness() + day + ", stem length is " + getStemLength() + " cm., " +
                    "price:" + " $" + getPrice() + ". \n";
        }

    }


}











