import java.io.*;

public class NumberSpiral {
    public static String getValue(long r, long c){
         long ans = 1;
         if(r>c){ans = (r-1) * (r-1);

            if(r % 2 != 0) ans += c;
            else ans += 2*r-c;

         }else {
             ans = (c -1)*(c-1);
             if(c%2 == 0) ans+= r;
             else ans+= 2*c-r;
         }

        return String.valueOf(ans);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i < t; i++){
            String[] input = br.readLine().split(" ");
            bw.write(getValue(Long.parseLong(input[0]), Long.parseLong(input[1])));
            bw.write("\n");
        }
        bw.flush();
    }
}
