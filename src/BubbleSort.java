import java.util.Collections;
import java.util.List;

public class BubbleSort implements Algorithm {
    public void run(List<Integer> listToSort){
        int n = listToSort.size();//size of the input

        for(int i=0; i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(listToSort.get(j) > listToSort.get(j+1)){ //if the value at position j is higher than the next value...
                    int temp = listToSort.get(j);
                    listToSort.set(j, listToSort.get(j+1)); //swap values
                    listToSort.set(j+1, temp); //swap values

                    //Collections.swap(listToSort, j, j+1); //simple way to do above
                }
            }
        }
    }

    @Override
    public String getAlgorithmName() {
        return "BubbleSort";
    }
}
