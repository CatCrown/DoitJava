package chapter06.lessonP197.Q6;

public class CardCompany {
    private static CardCompany instance = new CardCompany();
    private CardCompany(){}
    public static CardCompany getInstance(){
        if (instance == null){
            instance = new CardCompany();
        }
        return instance;
    }
    public Card creatCard(){
        Card card = new Card();
        return card;
    }
}
