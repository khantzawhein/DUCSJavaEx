import java.util.Scanner;

class Ex43 {
    public static void main(String[] args) {
        int type = 0;
        double price = 0.0;
        double profit = 0.0;

        // type = Integer.parseInt(args[0]);
        // price = Integer.parseInt(args[1]);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Type: ");
        type = scan.nextInt();
        price = scan.nextDouble();
        if(type == 0) {
            if(price < 20.00) {
                profit = (price*10/100);
            }
            else if(price >= 20.00 && price <= 50.00) {
                profit = (price * 15/100);
            }
            else if(price > 50.00) {
                profit = (price * 20/100);
            }
        }
        if(type == 1) {
            if(price < 5.00 || price > 30.00) {
                profit = (price*5/100);
            }
            else if(price >= 5.00 && price <= 30.00) {
                profit = (price*10/100);
            }
        }
        System.out.println("Your profit is : " + profit + " $");

    }
}