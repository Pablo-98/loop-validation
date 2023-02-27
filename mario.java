import java.util.Scanner;

public class mario {
    public static void main (String[] args) {
        Scanner scnr = new Scanner (System.in);
        System.out.println("enter a height: ");

        int height;

        boolean flag = false;
// height has to be below 8
//use of a flag to not let the user enter until the height is a valid input
        do{
            height = scnr.nextInt();
            if (height > 0 &&  height <= 9) {
                flag = true;
            }
        } while (!flag);
        scnr.close();

        for(int i = 0; i < height; i++ ) {
            // use of a sentinal
            System.out.print("#");
            System.out.println();
        }

    }
}