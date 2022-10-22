import java.util.ArrayList;
import java.util.HashMap;

public class Fibonacci {
    private HashMap<Integer,Integer> cache = new HashMap<Integer,Integer>();
    private ArrayList<Integer> series = new ArrayList<>();

    public Fibonacci() {
        cache.put(1,1);
        cache.put(2,1);
    }

    public int fibbonacciWithoutDP(int n){
        if(n <= 2) return  1;
        return fibbonacciWithoutDP(n-1) + fibbonacciWithoutDP(n-2);
    }

    public int fibbonacciWitDP(int n){
        if(n<=2) return 1;

        //check the number is already in the hashmap
        if(cache.containsKey(n)){
            return cache.get(n);
        }
        else{
            int value = fibbonacciWitDP(n-1) + fibbonacciWitDP(n-2);
            cache.put(n,value);
            return value;
        }
    }

    public HashMap<Integer,Integer> fibbonacciSeries(int n){
        //return the cache
        fibbonacciWitDP(n);
        return cache;
    }
}
