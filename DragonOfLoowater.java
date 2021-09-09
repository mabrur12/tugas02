package pbo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class DragonOfLoowater {
    public static void main(String[] args) {
        List<Integer> dragon = new ArrayList<>();
        List<Integer> knight = new ArrayList<>();
        List<Integer> minimum = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int jumDragon, jumKnight;

        System.out.print("mau berapa dragon : ");
        jumDragon = input.nextInt();
        System.out.println();
        for (int i = 0; i < jumDragon; i++) {
            System.out.print("masukan diameter kepala dragon " + (i + 1) + " : ");
            int isi = input.nextInt();
            dragon.add(isi);
        }
        Collections.sort(dragon);

        System.out.print("\nmau berapa knight : ");
        jumKnight = input.nextInt();
        System.out.println();
        for (int i = 0; i < jumKnight; i++) {
            System.out.print("masukan tinggi knight " + (i + 1) + " : ");
            int isi = input.nextInt();
            knight.add(isi);
        }
        Collections.sort(knight);
        System.out.println("\nlist diameter kepala dragon = " + dragon);
        System.out.println("list tinggi knight = " + knight);

        for (int d : dragon) {
            for (int k : knight) {
                if (k >= d) {
                    minimum.add(d + 1);
                    break;
                } else {
                    continue;
                }
            }
        }

        if (minimum.size() != dragon.size()) {
            System.out.println("\nKnight Fall");
        } else if (minimum.size() == dragon.size()) {
            int jumlah = 0;
            for (int j : minimum) {
                jumlah += j;

            }
            System.out.println("\njumlah minimum tinggi knight yang dibutuhkan adalah " + jumlah);
        }

    }
}
