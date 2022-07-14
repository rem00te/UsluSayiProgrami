import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n, k, tplm = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Üs alınacak sayı : ");
        n = input.nextInt();
        System.out.print("Üs olacak sayı : ");
        k = input.nextInt();


        for (int i = 1; i <= k; i++) {

            tplm *= n;
        }
        System.out.println("Sonuç :" + tplm);

    }
}
