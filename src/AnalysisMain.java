import java.util.ArrayList;
import java.util.List;

public class AnalysisMain {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
//        list.add(6);
//        list.add(2);
//        list.add(3);
//        list.add(42);
//        list.add(8);
//        list.add(1);
//        list.add(5);
//        list.add(7);
//        list.add(60);
//        list.add(62);

        initialiseList(list); //replaces code above //We can call this to reset list //this can be done by highlighting>refactor>Extract Method
        List<Algorithm> algorithms = new ArrayList<>();
        algorithms.add(new BubbleSort());
        algorithms.add(new QuickSort());


        for(Algorithm algorithm : algorithms){
            long start = System.nanoTime(); //take time at start of algorithm, before it has started processing
            algorithm.run(list);
            long end = System.nanoTime(); //take note of time at point after execution
            printList(list);
            System.out.println("The algorithm " + algorithm.getAlgorithmName() + " ran in " + (end-start) + " nanoseconds"); //get difference between the two which shows how long the algorithm has taken to process
            initialiseList(list); //reset at end
        }
    }

    private static void printList(List<Integer> list) {
        for(int i = 0; i< list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
    }

    private static void initialiseList(List<Integer> list) {
        list = new ArrayList<>();
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
    }
}
