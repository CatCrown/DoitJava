package chapter06.lessonP197.Q6;

public class CardCompanyTest {
    public static void main(String[] args) {
        CardCompany cardCompany = CardCompany.getInstance();
        Card cardLee = cardCompany.creatCard();
        Card cardKim = cardCompany.creatCard();
        System.out.println("이 씨는 카드 번호 " + cardLee + "인 카드를 만들었습니다. ");
        System.out.println("김 씨는 카드 번호 " + cardKim + "인 카드를 만들었습니다. ");
    }
}
