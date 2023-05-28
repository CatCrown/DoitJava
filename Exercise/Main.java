package Exercise;

public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();

        bus1.boarding(2);
        bus1.changeFuel((short) -50);
        bus1.changeState();
        System.out.println("상태: " + bus1.getState());

        bus1.changeFuel((short) 10);
        bus1.changeState();
        bus1.boarding(45);
        bus1.boarding(5);
        bus1.changeFuel((short) -55);
//        bus1.changeState();
        System.out.println("상태: " + bus1.getState());
    }
}
