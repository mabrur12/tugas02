package pbo;

import java.util.Scanner;
import java.util.Arrays;

public class binarysearch {
    public static void main(String[] args) {
        System.out.println("program binary search.....\n");
        int[] testcase = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
        Arrays.sort(testcase);
        int awal = 0, akhir = testcase.length - 1, tengah, cari, ulang = 0;
        boolean ketemu = false;

        Scanner input = new Scanner(System.in);
        System.out.print("masukan angka yang anda cari : ");
        cari = input.nextInt();

        while (ketemu != true) {
            tengah = (awal + akhir) / 2;
            if (testcase[tengah] == cari && ulang <= testcase.length / 2) {
                System.out.println("angka ketemu berada di index ke - " + tengah);
                ketemu = true;
            } else if (testcase[tengah] < cari && ulang <= testcase.length / 2) {
                awal = tengah + 1;
                ulang++;
            } else if (testcase[tengah] > cari && ulang <= testcase.length / 2) {
                akhir = tengah - 1;
                ulang++;
            } else {
                System.out.println("angka yang anda cari tidak ada !");
                ketemu = true;
            }
        }

    }

}
