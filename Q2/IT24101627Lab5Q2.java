import java.util.Scanner;
public class IT24101627Lab5Q2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of new members : ");
        int newmembers = input.nextInt();

        switch (newmembers) {
            case 0: System.out.println("No Price"); break;
            case 1: System.out.println("Prize is a : Pen"); break;
            case 2: System.out.println("Prize is a : Umbrella"); break;
            case 3: System.out.println("Prize is a : Bag"); break;
            case 4: System.out.println("Prize is a : Travelling Chair"); break;

            default: if(newmembers>=5) {
                System.out.println("Prize is a : Headphone");
            }
                else {
                    System.out.println("Input must be number 0 or greater");
                }
        }
    }

}