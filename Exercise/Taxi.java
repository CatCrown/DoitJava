package Exercise;

public class Taxi extends Transportation {
    public String reach; // 목적지
    public int distance = 1; // 목적지까지의 거리, 기본거리
    public int charge = 1000;// 거리당 요금
    public int normal_charge = 3000; // 기본요금
    public int profit_taxi = 0;
    public int total_profit; // 누적 요금


    public Taxi() {
        super();
        start();
        setFuel((short)0);
        setMaxPassenger(4);
        System.out.println(transNo + "번 택시객체 생성");
    }

    public void taxi_cost(String reachName, int reachDis){
        System.out.println("기본 요금 확인 = " + normal_charge);
        setReach(reachName);
        setDistance(reachDis);
        profit_taxi = this.distance * charge + normal_charge;
        this.total_profit += profit_taxi;
        System.out.println("목적지 = " + reachName);
        System.out.println("목적지까지 거리 = " + reachDis + "km");
        System.out.println("지불할 요금 = " + profit_taxi);
    }

    public void boarding(int board_passenger){
        setPassenger(0);
        this.passenger = board_passenger;
        if (this.state.equals("운행") && this.passenger <= MAX_PASSENGER){
            System.out.println("탑승 승객 수 = " + board_passenger);
            System.out.println("잔여 승객 수 = " + (MAX_PASSENGER - this.passenger));
        } else if (this.state.equals("차고지행")) {
            this.passenger = 0;
            System.out.println("운행 중지 하였습니다. 승객들이 모두 차에서 내렸습니다. ");
        } else if (this.passenger > MAX_PASSENGER){
            System.out.println("탑승 승객 수 = " + board_passenger);
            System.out.println("잔여 승객 수 = " + (MAX_PASSENGER - this.passenger));
        }

    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getTotal_profit() {
        return total_profit;
    }

    public void setTotal_profit(int total_profit) {
        this.total_profit = total_profit;
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
