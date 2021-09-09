package pbo;

public class evenOrOddNumber {
    public static void main(String[] args) {
        int[] testCaseArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("program ini dibuat untuk mengetahui status bilangan ganjil atau genap");
        for (int i : testCaseArray) {
            if (i % 2 == 0) {
                System.out.println("data ke " + i + " adalah bilangan bulat");
            } else if (i % 2 != 0) {
                System.out.println("data ke " + i + " adalah bilangan ganjil");
            }
        }
    }
}
