import java.util.Scanner;

/**
 * addition
 */
public class addition {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the first number");
    int num1 = input.nextInt();
    System.out.println("Enter the second number");
    int num2 = input.nextInt();
    System.out.println("The result is " + add(num1, num2));
  }

  public static int add(int num1, int num2) {
    return num1 + num2;
  }
}
