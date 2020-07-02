import java.util.Scanner;

public class Exercice01 {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            int numberStudents = scan.nextInt();
            int[] noteStudents = new int[numberStudents];

            for(int i = 0; i<=noteStudents.length-1; i++){
                noteStudents[i] = scan.nextInt();
            }

            for(int i = 0; i<=noteStudents.length-1; i++){
                noteStudents[i] = verifyRounding(noteStudents[i]);
            }

            for(int i = 0; i<=noteStudents.length-1; i++){
                System.out.println(noteStudents[i]);
            }

        }

        private static int verifyRounding(int note){

            if(note < 38 || note % 5 < 3)
                return note;


            if(note % 2 <= 1)
                return note + ((note % 5) -1);

            return note + (note % 5);
        }
}