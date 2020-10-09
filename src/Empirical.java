import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empirical {
    //Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String input = scanner.nextLine();
        boolean keepRunning = true;
        do {
            System.out.println("Press c to continue or q to exit: ");
            String temp = scanner.next();//gets input as a String

            if (temp.equals("q"))//checks is "q" was put in
            {
                System.out.println("Exiting");
                break;//ends program
            }


            System.out.println("------------------------------------------------------------------");
            System.out.println("Please input number of items to be stored in the array: ");
            int n = scanner.nextInt();
            System.out.println();
            List<Integer> list = new ArrayList<>(n);


            for (int i = 0; i < n; i++) {
                //System.out.print(list.get(i) + " ");
                list.add(i - 1);
            }

            for (int i = 0; i < n; i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
            //System.out.println("------------------------------------------------------------------");
        }while(keepRunning);
    }
}
