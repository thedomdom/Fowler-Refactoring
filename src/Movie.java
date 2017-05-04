public class Movie {
    private String title;
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPrice(priceCode);
    }

    double getCharge(int daysRented) {
        return price.getCharge(daysRented);
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