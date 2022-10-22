import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public BinarySearch() {
    }

    public int binarySearchRecursive(ArrayList<Integer> list, int key){
        //Sort the list
        Collections.sort(list);
        return binarySearchRecursiveImplementation(list,0, list.size(),key);
    }

    private int binarySearchRecursiveImplementation(ArrayList<Integer> list, int start, int end, int key){

        int mid = (int)(start+end) / 2;

        if(start>end) return -1;

        if(list.get(mid) == key){
            return mid;
        }
        else if(list.get(mid) < key){
            return binarySearchRecursiveImplementation(list,mid+1,end,key);
        }
        else if(list.get(mid) > key){
            return binarySearchRecursiveImplementation(list,start,mid-1,key);
        }

        return  -1;
    }
}
