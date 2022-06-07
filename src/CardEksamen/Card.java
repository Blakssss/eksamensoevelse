package CardEksamen;


public class Card{
    private int value;
    private Suit suit;

    Card(int value, Suit suit){
        this.value=value;
        this.suit=suit;
    }



    public boolean beats(Card card1, Card card2){
        return card1.value > card2.value;
    }


    public static void main(String[] args) {
        Card card1 = new Card(13,Suit.HEARTS);
        Card card2 = new Card(5,Suit.CLUBS);
        System.out.println(card1.beats(card1,card2));
    }
}
