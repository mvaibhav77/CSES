import java.util.Scanner;

public class Repetitions {
  public static int longestRepetition(String s){
    int max = 1;
    char[] carr = s.toCharArray();
    int n = carr.length;
    int i = 0;
    while(i < n){
      int curr = 1;
      int j = i+1;
      while(j < n && carr[i] == carr[j]){
        curr++;
        j++;
      }
      max = Math.max(max, curr);
      i = j;
    }

    return max;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int result = longestRepetition(s);

    System.out.println(result);
  }
}
