package chapter04;

public class Q2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++){
            if (i % 2 != 0) continue;
            for (int j = 1; j <= 9; j++){
                System.out.printf("%d * %d = %d%n", i,j, i*j);
            }
        }
    }
}
