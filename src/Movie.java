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
        return price.getFrequentRenterPoints(daysRented);
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