package homework_algorithms;

public class ProductPurchases {
    //        Second Task
//        1. Make variables with prices final and static
//        2. Create a cycle counting money spent for Pizzas.
//        3. Make a method counting the amount of Pizzas
//        5. Create method counting the amount of gums can be purchased for the rest amount.
//        6. Create method counting the amount of sweets can be purchased.
//        7. Create method printing the result.
    final static int priceForGum = 26;
    final static int moneyWeHave = 1000;
    final static int priceForPizza = 230;
    final static double priceForSweet = 2.5;

    public static void main(String[] args) {
        int moneySpentForPizza = 0;

        for (int i = 1; i <= moneyWeHave / priceForPizza; i++) {
            moneySpentForPizza += priceForPizza;
        }


        PrintResult("Pizzas bought: ", CalculateAmountOfPizzas());
        PrintResult("Gums bought : ", CalculateAmountOfGums());
        PrintResult("Sweets bought : ", CalculateAmountOfSweets());

    }

    public static int CalculateAmountOfPizzas() {
        return moneyWeHave / priceForPizza;
    }

    public static int CalculateAmountOfGums() {
        return (moneyWeHave - CalculateAmountOfPizzas() * priceForPizza) / priceForGum;
    }

    public static double CalculateAmountOfSweets() {
        return (moneyWeHave - CalculateAmountOfPizzas() * priceForPizza -
                CalculateAmountOfGums() * priceForGum)
                / priceForSweet;
    }

    public static void PrintResult(String Product, double amountOfProduct) {
        System.out.println(Product + amountOfProduct);
    }
}
