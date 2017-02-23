package cleancode.domain.loyalty;

/**
 * Created by williaam on 23/02/2017.
 */
public class LoyaltyCard {

    private String barcode;
    private long bonusPoints;

    public LoyaltyCard(String barcode, long bonusPoints) {
        this.barcode = barcode;
        this.bonusPoints = bonusPoints;
    }

    public LoyaltyCard(){}

    public String getBarcode() {
        return barcode;
    }

    public long getBonusPoints() {
        return bonusPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoyaltyCard that = (LoyaltyCard) o;

        if (bonusPoints != that.bonusPoints) return false;
        return barcode != null ? barcode.equals(that.barcode) : that.barcode == null;
    }

    @Override
    public int hashCode() {
        int result = barcode != null ? barcode.hashCode() : 0;
        result = 31 * result + (int) (bonusPoints ^ (bonusPoints >>> 32));
        return result;
    }
}