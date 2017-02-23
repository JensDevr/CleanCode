package cleancode.domain.shoppingcart;

/**
 * Created by sannev on 23/02/2017.
 */
public class Item {
    private String itemId;
    private String itemName;
    private int piece;
    private String date;

    public Item(String itemId, String itemName, int piece, String date) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.piece = piece;
        this.date = date;
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getPiece() {
        return piece;
    }

    public String getDate() {
        return date;
    }
}
