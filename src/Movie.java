public class Movie {
    private String title;
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPrice(priceCode);
    }

    double getCharge(int daysRented) {
        double charge = 0;
        switch (price) {
            case REGULAR:
                charge += 2;
                if (daysRented > 2)
                    charge += (daysRented - 2) * 1.5;
                break;
            case NEW_RELEASE:
                charge += daysRented * 3;
                break;
            case CHILDRENS:
                charge += 1.5;
                if (daysRented > 3)
                    charge += (daysRented - 3) * 1.5;
                break;
        }
        return charge;
    }

    public int getFrequentRenterPoints(int daysRented) {
        // add bonus for a two day new release rental
        if ((price == Price.NEW_RELEASE) && daysRented > 1) return 2;
        return 1;
    }

    public int getPriceCode() {
        return price.ordinal();
    }

    public void setPrice(int priceCode) {
        this.price = Price.values()[priceCode];
    }

    public String getTitle() {
        return title;
    }
}