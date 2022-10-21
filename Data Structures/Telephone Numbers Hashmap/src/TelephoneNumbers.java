import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class TelephoneNumbers {
    private HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();

    public TelephoneNumbers() {
    }

    //hash function
    public int hash(String TelephoneNumber){
        int hash=0;

        try{
            int digit10 = Integer.parseInt(TelephoneNumber.substring(9,10));
            int digit9 = Integer.parseInt(TelephoneNumber.substring(8,9));
            int digit8 = Integer.parseInt(TelephoneNumber.substring(7,8));

            int number = digit8*100+digit9*10+digit10;
            hash = number;
        }
        catch(Exception e){
            System.out.println("Error "+e);
        }


        return hash;
    }

    

    public static void main(String[] args) throws IOException {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        TelephoneNumbers tn = new TelephoneNumbers();


        try {
            System.out.println("Enter a telephone number: ");
            String input = in.readLine();

            //check the input whether it is a valid telephone number
            if(input.length() != 10){
                System.out.println("Invalid telephone number");
            }
            else{
                int hash = tn.hash(input);
                System.out.println("Hash value: "+ hash);
            }

        }
        catch(Exception e){
            System.out.println(e);
        }


    }

}
