package Moudle;
import java.util.ArrayList;
public abstract class Card {
    private static ArrayList<Card> cards = new ArrayList<>();
    private String name;
    private int cardID;
    private int shopPrice;
    private int manaPrice;
    //0:spell   1:minion    2:hero
    private int cardType;

    public int getCardType () {
        return cardType;
    }

    protected Card( String name, int cardID, int shopPrice, int manaPrice) {
        this.name = name;
        this.shopPrice = shopPrice;
        this.manaPrice = manaPrice;
        cards.add(this);
    }
    public String getName() {
        return name;
    }
    public int getShopPrice() {
        return shopPrice;
    }
    public static void showCardInfo(int cardID) {
        Card card = findCard(cardID);
        printCardInfo(card);
    }
    public static void showCardInfo(int cardID, ArrayList<Card> cards) {
        Card card = findCard(cardID, cards);
        printCardInfo(card);
    }
    private static void printCardInfo(Card card) {
        if (card == null) {
            System.out.println("there is no card with this ID");
            return;
        }
        System.out.println("name: " + card.name);
        System.out.println("cardID: " + card.cardID);
        System.out.println("price: " + card.shopPrice + " derick");
        System.out.println("mana price: " + card.manaPrice);
    }
    public static Card findCard(int cardID) {
        for (Card card : cards) {
            if (card.cardID == cardID)
                return card;
        }
        return null;
    }
    public static Card findCard(String name) {
        for (Card card : cards) {
            if (card.name.equals(name))
                return card;
        }
        return null;
    }

    public static Card findCard(String name, ArrayList<Card> cards) {
        for (Card card : cards) {
            if (card.name.equals(name))
                return card;
        }
        return null;
    }

    public static Card findCard(int cardID, ArrayList<Card> cards) {
        for (Card card : cards) {
            if (card.cardID == cardID)
                return card;
        }
        return null;
    }
}