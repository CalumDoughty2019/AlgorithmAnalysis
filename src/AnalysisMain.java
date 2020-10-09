import java.util.ArrayList;
import java.util.List;

public class AnalysisMain {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(2);
        list.add(3);
        list.add(42);
        list.add(8);
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(60);
        list.add(62);

        long start = System.nanoTime(); //take time at start of algorithm, before it has started processing
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.run(list); //run the algorithm

        for(int i=0;i< list.size();i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

        long end = System.nanoTime(); //take note of time at point after execution
        System.out.println("The algorithm ran in " + (end-start) + " nanoseconds"); //get difference between the two which shows how long the algorithm has taken to process
    }
}
