public enum Price {
    REGULAR,
    NEW_RELEASE,
    CHILDRENS;

    double getCharge(int daysRented) {
        double charge = 0;
        switch (this) {
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
}
