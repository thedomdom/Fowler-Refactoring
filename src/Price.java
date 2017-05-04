public enum Price {
    REGULAR {
        @Override
        public double getCharge(int daysRented) {
            double result = 2;
            if (daysRented > 2)
                result += (daysRented - 2) * 1.5;
            return result;
        }
    },
    NEW_RELEASE {
        @Override
        public double getCharge(int daysRented) {
            return daysRented * 3;
        }

        public int getFrequentRenterPoints(int daysRented) {
            // add bonus for a two day new release rental
            return (daysRented > 1) ? 2 : 1;
        }
    },
    CHILDRENS {
        @Override
        public double getCharge(int daysRented) {
            double result = 1.5;
            if (daysRented > 3)
                result += (daysRented - 3) * 1.5;
            return result;
        }
    };

    public abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
