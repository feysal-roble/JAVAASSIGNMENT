import java.util.Scanner;

/**
 *
 * A parcel delivery company charges the following rates to ship a parcel.
 *
 * • Up to and including 10 pounds: $2.15 per pound
 * • Up to and including 20 pounds: $1.55 per pound
 * • Up to and including 30 pounds: $1.15 per pound
 *
 * The shipping company does not ship parcels that weigh over 30 pounds.
 *
 * So, a parcel that weighs 17 pounds will cost $1.55 x 17 = $26.35.
 *
 * Write a program that asks the user for the weight of a parcel and displays
 * whether it can be shipped, and what it will cost.
 *
 * Optional extra: the most obvious solution to this problem uses if statements
 * for the price bands. Can you think of a different way?
 * Hint – loops and arrays of price and max weights for price?
 *
 */

public class Question_5_Parcel_Delivery {
    public static Double doubleInput(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        return input.nextDouble();
    }

    public static double MAX_WEIGHT = 30;
    public static double[] PRICES = {0, 2.15, 1.55, 1.15};
    public static double[] MAX_WEIGHTS = {0, 10, 20, 30};

    public static void main(String[] args) {

        double weight = doubleInput("Enter weight of parcel");

        boolean canShip = canShip(weight);

        if (canShip) {
            double price = calculatePrice(weight);
            System.out.printf("It will cost $%.2f to send your %.2f pound parcel.", price, weight);
        } else {
            System.out.printf("A parcel that weighs %.2f pounds can't be shipped.", weight);
        }
    }

    public static boolean canShip(double weight) {
        return weight > 0 && weight <= MAX_WEIGHT;
    }

    public static double calculatePrice(double weight) {
        if (!canShip(weight)) {
            return 0;
        }

        int priceIndex = 0;
        for (int i = 1; i < MAX_WEIGHTS.length; i++) {
            if (weight <= MAX_WEIGHTS[i]) {
                priceIndex = i;
                break;
            }
        }

        return weight * PRICES[priceIndex];
    }
}
