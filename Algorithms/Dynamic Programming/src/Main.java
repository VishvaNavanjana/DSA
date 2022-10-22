import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Fibonacci fb = new Fibonacci();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter the number to find the fibonacci number");
            int n = Integer.parseInt(br.readLine());

            long startTimeWithoutDp = System.nanoTime();
            int fibNumberWithoutDp = fb.fibbonacciWithoutDP(n);
            long endTimeWithoutDp = System.nanoTime();
            long totalTimeWithoutDp = endTimeWithoutDp - startTimeWithoutDp;

            long startTimeWithDp = System.nanoTime();
            int fibNumberWithDp = fb.fibbonacciWitDP(n);
            long endTimeWithDp = System.nanoTime();
            long totalTimeWithDp = endTimeWithDp - startTimeWithDp;

            System.out.println("Fibonacci number without DP is " + fibNumberWithoutDp
                                + "\n RunTime = " + totalTimeWithoutDp/1000 + " micro seconds");

            System.out.println("Fibonacci number with DP is " + fibNumberWithDp
                                + "\n RunTime = " + totalTimeWithDp/1000 + " micro seconds");

            HashMap <Integer,Integer> series = fb.fibbonacciSeries(n);

            for(int i=1; i<=n; i++){
                System.out.print(series.get(i) + " ");
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
