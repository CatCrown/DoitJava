package chapter06.lessonP197.Q6;

public class Card {
    private static int serialNum = 10000;
    private int cardNum;

    public Card(){
        serialNum++;
        cardNum = serialNum;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Card.serialNum = serialNum;
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }
}
