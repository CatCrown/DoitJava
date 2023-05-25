package chapter04;

public class Q4 {
    public static void main(String[] args) {
        int line = 4;
        int space = line-1;
        for (int i = 1; i <= line; i++){
            for (int j = 1; j <= space; j++){
                System.out.printf(" ");
            }
            for (int j = 1; j <= i*2-1; j++){
                System.out.printf("*");
            }
            for (int j = 1; j <= space; j++){
                System.out.printf(" ");
            }
            space--;
            System.out.println();
        }
    }
}
