package chapter04;

public class Q5 {
    public static void main(String[] args) {
        int line = 7;
        int space = line/2;
        int star = 1;
        for (int i = 1; i <= line; i++){
            for (int j = 1; j <= space; j++){
                System.out.printf(" ");
            }
            for (int j = 1; j <= star; j++){
                System.out.printf("*");
            }
            for (int j = 1; j <= space; j++){
                System.out.printf(" ");
            }
            if (i <= line/2){
                space--;
                star += 2;
            } else{
                space++;
                star -= 2;
            }

            System.out.println();
        }


    }
}
