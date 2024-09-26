import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Permutations {
    public static void findSolution(int N, BufferedWriter bw){
        try{
            // Output all even numbers first
            for (int i = 2; i <= N; i += 2) {
                bw.write(i + " ");
            }

            // Output all odd numbers next
            for (int i = 1; i <= N; i += 2) {
                bw.write(i + " ");
            }

            bw.write("\n");

            bw.flush();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = sc.nextInt();
        if(N == 2 || N == 3){
            System.out.println("NO SOLUTION");
        }else{
            findSolution(N, bw);
        }
    }
}
