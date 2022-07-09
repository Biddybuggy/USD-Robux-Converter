import java.util.*;

class Main {
  static Scanner sc = new Scanner(System.in);

  // Converting USD to RBX
  static double USD_RBX(double USD) {
    double RBX = USD*(1/0.0125);
    return RBX;      
  }

  // Converting RBX TO USD
  static double RBX_USD(double RBX) {
    double USD = RBX*0.0125;
    return USD;
  }

  // Reading Currency Value
  static double input(String word) {
    System.out.println("\nEnter " + word + " value");
    double val = sc.nextDouble();
    return val;
  }

  // Printing Converted Currency Value
  static void output(double val, String word) {
    System.out.printf("\n%s value: %.4f", word, val);
  }

  // Driver Method
  public static void main(String[] args) {
    System.out.println("1. USD Tto RBX \n2. RBX to USD");
    System.out.println("\nEnter choice: ");
    int ch = sc.nextInt();
    double num = 0;
    switch (ch) {
      case 1: num = input("USD");
        output(USD_RBX(num), "RBX");
        break;
      case 2: num = input("RBX");
        output(RBX_USD(num), "USD");
        break;
      default: System.out.println("Invalid input.");
    }     
  }
}
