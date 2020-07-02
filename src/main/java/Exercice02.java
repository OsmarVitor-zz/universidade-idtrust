import java.util.Scanner;

public class Exercice02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int operation;
        int queueLenght = scan.nextInt();
        int[] queue = new int[queueLenght];


        for(int i=0; i<queueLenght; i ++){
            int number = 0;
            operation = scan.nextInt();

            if(operation == 1)
                number = scan.nextInt();
            
             switch(operation){
                 case 1:
                     orderQueue(queue, number);
                     break;
                 case 2:
                     disorganizeQueueUpToInit(queue);
                     break;

                 case 3:
                     printQueue(queue);
                     break;
             }

        }

    }

    private static void orderQueue(int[] queue, int number){
        System.out.println("1");
    }

    private static void disorganizeQueueUpToInit(int[] queue){
        System.out.println(2);
    }

    private static void printQueue(int[] queue){
        System.out.println(3);
    }


}