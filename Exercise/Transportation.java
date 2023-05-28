package Exercise;

public class Transportation {
    public static int transNo = 1000;
    public short fuel = 100 ;
    public int speed = 0;
    public int passenger = 0;
    static int MAX_PASSENGER;
    public String state;
    public int cost; // 요금
    public int profit; // 대중교통 총 수익

    public Transportation() {
        transNo++;
    }
    
    public void start(){
        changeSpeed(50);

    }
    public void end(){
        if (this.state.equals("운행종료") && speed == 0){
            System.out.println("운행 종료하였습니다.");
        }
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public static void setMaxPassenger(int maxPassenger) {
        MAX_PASSENGER = maxPassenger;
    }

    public void changeFuel(short fuel){
        this.fuel += fuel;
        System.out.println("주유량 = " + this.fuel);
        if (this.fuel < 5){
            changeState();
        }
        if (this.fuel < 10) {
            System.out.println("주유 필요합니다.");
        }


    }
    
    public void changeSpeed(int speed){
        if (speed == 0){
            System.out.println("운행 종료하였습니다.");
        } else {
            if (this.fuel >= 10){
                this.speed = speed;
                this.state = "운행";
            } else {
                System.out.println("주유량을 확인해주세요.");
            }
        }
    }
    
    public void changeState(){
        if (this.state.equals("운행")){
            this.state = "차고지행";
        } else  {
            this.state = "운행";
        }
    }
    
    public void boarding(int passenger){
        if (this.state.equals("운행") && this.passenger + passenger <= MAX_PASSENGER){
            this.passenger += passenger;
            profit = this.cost * passenger;
            System.out.println("탑승 승객 수 = " + passenger);
            System.out.println("잔여 승객 수 = " + (MAX_PASSENGER - this.passenger));
            System.out.println("요금 확인 = " + profit);
        } else if (this.state.equals("차고지행")) {
            this.passenger = 0;
            System.out.println("운행 중지 하였습니다. 승객들이 모두 차에서 내렸습니다. ");
        } else if (this.passenger + passenger > MAX_PASSENGER){
            System.out.println(MAX_PASSENGER + "명까지 탈 수 있습니다. 더 이상 탑승이 어렵습니다. ");
        }

    }

}
