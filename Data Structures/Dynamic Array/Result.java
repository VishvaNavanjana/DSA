import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> answers = new ArrayList<>();
        int lastAnswer = 0;
        int size = queries.size(); //number of quaries

        //initialize arraylist
        for(int j=0; j<n; j++){
            arr.add(new ArrayList<Integer>());
        }

        try{
            int x,y,queryType,idx,idy;
            for(int i=0; i<size ;i++){
                queryType = queries.get(i).get(0);
                x = queries.get(i).get(1);
                y = queries.get(i).get(2);

                if(queryType == 1){
                    idx = idxCalculation(x,lastAnswer,n);
                    arr.get(idx).add(y);
                }
                else if(queryType == 2){
                    idx = idxCalculation(x,lastAnswer,n);
                    idy = idyCalculation(y,arr.get(idx).size());
                    lastAnswer = arr.get(idx).get(idy);
                    answers.add(lastAnswer);
                }
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

        return answers;
    }


    public static int idxCalculation(int x, int lastAnswer, int n){
        return ((x^lastAnswer) % n);
    }

    public static int idyCalculation(int y, int size){
        return (y % size);
    }

}