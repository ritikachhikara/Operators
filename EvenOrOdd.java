
import java.util.Scanner;

class EvenOrOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        String result = (n % 2 == 0) ? n + " is Even" : n + " is Odd";
        System.out.println(result);
    }

}
