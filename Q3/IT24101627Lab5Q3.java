import java.util.Scanner;
public class IT24101627Lab5Q3 {

    public static void main(String[] args) {

        final double chargePerDay = 48000.00 ;
        final double discount_3To5_Days = 0.1;
        final double discount_5Or_MoreDays = 0.2;

        double discountRate = 0;
        int startDate, endDate;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31) : ");
        startDate = input.nextInt();

        System.out.print("Enter End Date (1-31) : ");
        endDate = input.nextInt();

        if(startDate<1 || startDate>1231 || endDate<1 || endDate>31) {

            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        if(startDate >= endDate) {

            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int numbOfDaysReserved = endDate - startDate;

        if(numbOfDaysReserved >= 3 && numbOfDaysReserved <= 4) {

            discountRate = discount_3To5_Days;
        }

        else if(numbOfDaysReserved >= 5) {

            discountRate =  discount_5Or_MoreDays;
        }

        double amountBeforeDiscount = numbOfDaysReserved * chargePerDay;
        double discountAmount = amountBeforeDiscount * discountRate;
        double amountToBePaid = amountBeforeDiscount - discountAmount;

           System.out.println("Room Charge Per Day : " + chargePerDay);
           System.out.println("Number Of Days Reserved : " +numbOfDaysReserved );
           System.out.println("Total Amount To Be Paid : " + amountToBePaid);
    }

}