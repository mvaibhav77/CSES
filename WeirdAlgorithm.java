import java.util.Scanner;

public class WeirdAlgorithm {

  public static void printPattern(long n){
    // lets make this recursive
    if(n == 1){
      System.out.print(n);
      return;
    }

    System.out.print(n + " ");
    if(n%2 == 0){
      printPattern(n/2);
    }else{
      printPattern(3*n + 1);
    }
  }

  public static void main(String[] args) {
    // take input
    Scanner scanner = new Scanner(System.in);
    long n = scanner.nextLong();
    scanner.close();

    if(n < 0){
      return;
    }
    

    // run function
    printPattern(n);
  }

}