import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BinarySearch bs = new BinarySearch();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //generate random array list with 1000 elements
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add((int)(Math.random() * 1000));
        }
        //sort array using java collections
        Collections.sort(list);

        String input = "";
        while (true){
            System.out.println("Enter Number to Search : ");
            input = br.readLine();
            if(input == "quit") break;

            try {
                //convert input to integer
                int key = Integer.parseInt(input);
                int index = bs.binarySearchRecursive(list,key);

                if(index < 0){
                    System.out.println("Number not exists in the List");
                }
                else{
                    System.out.println("Index is " + index + " : Value is " + list.get(index));
                }
            }
            catch (Exception e){
                System.out.println("Error : "+ e);
            }
        }

    }
}
