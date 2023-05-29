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
