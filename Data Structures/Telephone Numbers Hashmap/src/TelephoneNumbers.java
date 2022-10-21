import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class TelephoneNumbers {
    private HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();

    public TelephoneNumbers() {
        //initialize the Hashmap
        for(int i=0; i<100; i++){
            map.put(i, new ArrayList<String>());
        }
    }
    public ArrayList<String> getNumberSet(int key) {
        return map.get(key);
    }
    public void addNumber(String number) {
        //add the number to the Hashmap
        int key = hash(number);
        map.get(key).add(number);

        System.out.println("Added number " + map.get(key) + " to key " + key);
    }

    //print all the number list in the Hashmap with values
    public void printNumbers() {
        for(int i=0; i<100; i++){
            if(map.get(i).size()>0)
            System.out.println("Key " + i + ": " + map.get(i));
        }
    }

    //hash function
    public int hash(String TelephoneNumber){
        int hash=0;

        try{
            int digit10 = Integer.parseInt(TelephoneNumber.substring(9,10));
            int digit9 = Integer.parseInt(TelephoneNumber.substring(8,9));
            int digit8 = Integer.parseInt(TelephoneNumber.substring(7,8));
            int number = digit8*100 + digit9*10 + digit10;
            hash = number % 100;
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
            String input="";
            while (!input.equals("quit")) {
                System.out.println("Enter a telephone number: ");
                input = in.readLine();
                //check the input whether it is a valid telephone number
                if (input.length() != 10) {
                    System.out.println("Invalid telephone number");
                } else {
                    tn.addNumber(input);
                }
            }

            //print all the number list in the Hashmap with values
            tn.printNumbers();

            System.out.println("Enter a key ");
            System.out.println(tn.getNumberSet(Integer.parseInt(in.readLine())));

        }
        catch(Exception e){
            System.out.println(e);
        }

    }

}
