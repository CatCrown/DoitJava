package chapter06.lessonP196;

public class Car {
    private static int serialNum = 10000;
    private int carNumber;
    public Car(){
        serialNum++;
        this.carNumber = serialNum;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Car.serialNum = serialNum;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }
}
