package chapter06.lessonP196;

public class FactoryTest{
    public static void main(String[] args) {
        Factory factory1 = Factory.getInstance();
        Car mySonata = factory1.createCar();
        Car yourSonata = factory1.createCar();
        System.out.println(mySonata.getCarNumber());
        System.out.println(yourSonata.getCarNumber());
    }
}
