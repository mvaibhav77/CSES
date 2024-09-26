import java.util.Scanner;

public class MissingNumber {

  private static int findMissingNumber(int[] arr){
    int missing = 0;
    int n = arr.length + 1;

    for(int i = 0; i < n-1; i++){
      missing += i+1;
      missing -= arr[i];
    }

    return missing;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 5
    // 2 3 1 5
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n-1; i++){
      arr[i] = sc.nextInt();
    }
    sc.close();

    

    int missing = findMissingNumber(arr);

    System.out.println(missing);

    return;
  }
}
