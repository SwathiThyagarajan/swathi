package MAY.ex_07052024_Functions;

public class Lab155 {
    public static void main(String[] args) {

        // we have 1 friend and 1 begger both are asking for money
        // if I give money to my friend After 6 months he will return some money
        // But if you give money beggar will not return anything

        System.out.println("Start of the Program");
        int money = giveMoneyFriend(100);
        System.out.println(money);

        giveMoneyBeggar();
        System.out.println("End of the program");
    }

    static void giveMoneyBeggar() {
        System.out.println("Blessings!!");
        //if you give money beggar will not return anything
    }

    static int giveMoneyFriend(int i) {
        // if I give money to my friend After 6 months he will return some money
 //       i = i-30; After 6 months he will use 30rs & return remaining
        i = i + 8; // After 6 months he will give principal + interest 8%
        return i ;
    }
}
// void function will not return anything
// Function within function is not possible