import java.util.Collections;
import java.util.List;

public class QuickSort implements  Algorithm {

    public void run(List<Integer> listToSort){
        theSorter(listToSort, 0, listToSort.size()-1);
    }

    //low -> starting index, high -> ending index
    private void theSorter(List<Integer> listToSort, int low, int high){
        if(low < high){
            //pivot is the partitioning index, listToSort[pivot] keeps at right place
            int pivot = partition(listToSort, low, high);

            theSorter(listToSort, low, pivot-1); //before pivot
            theSorter(listToSort, pivot+1, high); //after pivot
        }
    }

    private int partition(List<Integer> listToSort, int low, int high){

        //pivot (Element to be placed at correct position)
        int pivot = listToSort.get(high);

        int i = (low-1); //index of smaller element

        for(int j = low; j <= high-1; j++){
            //If current element is smaller or equal to pivot
            if(listToSort.get(j) <= pivot){
                i++;
                Collections.swap(listToSort, i, j);
            }
        }
        Collections.swap(listToSort, i+1, high);
        return (i+1);
    }

    @Override
    public String getAlgorithmName() {
        return "QuickSort";
    }
}
