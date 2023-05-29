package Exercise;

public class Main {
    public static void main(String[] args) {
//        Bus bus1 = new Bus();
//        Bus bus2 = new Bus();
//
//        bus1.boarding(2);
//        bus1.bus_cost();
//        bus1.changeFuel((short) -50);
//        bus1.changeState();
//        System.out.println("상태: " + bus1.getState());
//
//        bus1.changeFuel((short) 10);
//        bus1.changeState();
//        bus1.boarding(45);
//        bus1.boarding(5);
//        bus1.bus_cost();
//        bus1.changeFuel((short) -55);
////        bus1.changeState();
//        System.out.println("상태: " + bus1.getState());


        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();


        taxi1.changeFuel((short) 100);
        System.out.println("상탱: " + taxi1.getState());
        taxi1.boarding(2);
        taxi1.taxi_cost();
    }
}
