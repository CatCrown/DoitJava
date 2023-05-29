package Exercise;

public class Bus extends Transportation{
    public int pay_bus = 0;
    public int cost = 1000; // 기본 요금
    public int profit = 0; // 대중교통 총 수익


    public Bus(){
        super();
        start();
        setMaxPassenger(30);
        setCost(1000);
        System.out.println(transNo + "번 버스객체 만들어짐!");
    }
    public void bus_cost(){
        profit = this.cost * this.board_passenger;
        System.out.println("요금확인 = " + profit);
    }

    public void boarding(int board_passenger){
        if (this.state.equals("운행") && this.passenger + board_passenger <= MAX_PASSENGER){
            this.board_passenger = board_passenger;
            this.passenger += board_passenger;
            System.out.println("탑승 승객 수 = " + board_passenger);
            System.out.println("잔여 승객 수 = " + (MAX_PASSENGER - this.passenger));
        } else if (this.state.equals("차고지행")) {
            this.passenger = 0;
            System.out.println("운행 중지 하였습니다. 승객들이 모두 차에서 내렸습니다. ");
        } else if (this.passenger + board_passenger > MAX_PASSENGER){
            System.out.println(MAX_PASSENGER + "명까지 탈 수 있습니다. 더 이상 탑승이 어렵습니다. ");
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

    public int getPay_bus() {
        return pay_bus;
    }

    public void setPay_bus(int pay_bus) {
        this.pay_bus = pay_bus;
    }
}
