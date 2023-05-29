package Exercise;

public class Taxi extends Transportation {
    public String reach; // 목적지
    public int distance = 1; // 목적지까지의 거리, 기본거리
    public int charge = 1000;// 거리당 요금
    public int normal_charge = 3000; // 기본요금
    public int profit_taxi = 0;


    public Taxi() {
        super();
        start();
        setFuel((short)0);
        setMaxPassenger(4);
        System.out.println(transNo + "번 택시객체 생성");
    }

    public void taxi_cost(){
        System.out.println("기본 요금 확인 = " + normal_charge);
        setReach("서울역");
        setDistance(2);
        profit_taxi = this.distance * charge + normal_charge;
        System.out.println(profit_taxi);
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getCharge() {
        return charge;
    }

    public void setChanrge(int charge) {
        this.charge = charge;
    }

    public int getNormal_charge() {
        return normal_charge;
    }

    public void setNormal_charge(int normal_charge) {
        this.normal_charge = normal_charge;
    }

    public String getReach() {
        return reach;
    }

    public void setReach(String reach) {
        this.reach = reach;
    }
}
