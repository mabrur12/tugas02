package pbo;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {

        int check;
        Scanner input = new Scanner(System.in);
        System.out.println("program ini dibuat untuk mengetahui bilangan prima\n");
        System.out.print("masukan bilangan yang ingin anda cek : ");
        int bilangan = input.nextInt();

        if (bilangan < 2) {
            System.out.print("bilangan anda bukan bilangan prima");
        } else if (bilangan == 2) {
            System.out.print("bilangan anda bilangan prima");
        } else if (bilangan > 2) {
            check = 0;
            for (int i = 3; i < bilangan; i++) {
                if (bilangan % i == 0) {
                    check++;
                    break;
                } else if (bilangan % i != 0) {
                    continue;
                }
            }
            if (check != 0) {
                System.out.print("bilangan anda bukan bilangan prima");
            } else if (check == 0) {
                System.out.print("bilangan anda bilangan prima");
            }
        }
    }

}
