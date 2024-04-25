import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n;
        int r;
        int combination = 1;

        Scanner input = new Scanner(System.in);// Initialize Scanner object for user input
        System.out.print("Eleman Sayısını Giriniz : ");// Prompt user to enter total number of elements
        n = input.nextInt();
        System.out.print("Grup Sayısını Giriniz : ");// Prompt user to enter number of elements in each group
        r = input.nextInt();

        int sub = n - r;// Calculate the difference between total number of elements and number of elements in each group
        int subtotal = 1;
        for (int i = 1; i <= sub; i++) {// Iterate through each element from 1 to the calculated difference
            subtotal *= i;
        }
        int ntotal = 1;
        for (int i = 1; i <= n; i++) { // Iterate through each element from 1 to the total number of elements
            ntotal *= i;
        }
        if (n < r) {
            System.out.println("Grup sayısı eleman sayısından büyük olamaz.");
        } else {
            int rtotal = 1;
            for (int i = 1; i <= r; i++) {// Iterate through each element from 1 to the calculated difference
                rtotal *= i;
            }
            combination = ntotal / (rtotal * subtotal);// Calculate the combination using formula
            System.out.print(combination);
        }
    }
}
