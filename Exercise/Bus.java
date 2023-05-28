package Exercise;

public class Bus extends Transportation{
    public int pay_bus = 0;

    public Bus(){
        super();
        start();
        setMaxPassenger(30);
        setCost(1000);
        System.out.println(transNo + "번 버스객체 만들어짐!");
    }

    public int getPay_bus() {
        return pay_bus;
    }

    public void setPay_bus(int pay_bus) {
        this.pay_bus = pay_bus;
    }
}
