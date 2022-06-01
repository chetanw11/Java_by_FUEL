package ElectricityBillCalculator;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        ElectricityBill eb = new ElectricityBill();
        eb.display();
        System.err.println("Note - This Bill Does Not Contain Any hidden Charges");
    }
}