package chapter04;

public class Q3 {
    public static void main(String[] args) {
        for (int dan = 1; dan <= 9; dan++){
            for (int times = 1; times <= 9; times++){
                if (times > dan) break;
                System.out.printf("%d * %d = %d%n", dan,times, dan * times);
            }
        }
    }
}
