package chapter06.lessonP197.Q5;

public class People {
    private int cost;// 소비
    private int count = 1;// 구매한 잔수

    public People(){}

    public void buy_cafeStar (int count){
        setCost(0);
        CafeStar cafeStar = new CafeStar();
        cost = cafeStar.getStarAmericano() * count;
        System.out.println("별다방에서 아메리카노 " + count + "잔을 구매하여 " + cost + " 원을 소비하였습니다.");
    }

    public void buy_cafeBean (int count) {
        setCost(0);
        CafeBean cafeBean = new CafeBean();
        cost = cafeBean.getBeanLattte() * count;
        System.out.println("콩다방에서 라떼 " + count + "잔을 구매하여 " + cost + " 원을 소비하였습니다.");

    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
