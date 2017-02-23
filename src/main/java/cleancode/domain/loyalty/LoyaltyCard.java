package cleancode.domain.loyalty;

/**
 * Created by williaam on 23/02/2017.
 */
public class LoyaltyCard {

    private String barcode;
    private int bonusPoints;

    public LoyaltyCard(String barcode, int bonusPoints) {
        this.barcode = barcode;
        this.bonusPoints = bonusPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoyaltyCard that = (LoyaltyCard) o;

        return barcode != null ? barcode.equals(that.barcode) : that.barcode == null;
    }

    @Override
    public int hashCode() {
        return barcode != null ? barcode.hashCode() : 0;
    }
}
