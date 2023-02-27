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
        // first for loop 
        for(int i = 0; i < height; ++i ) {
            // use of sentinals
            if ( height > 8 ) {
                System.out.println("follow instructions please");
                // not sure what the return statement does
                return;
            }
            //sentinal 2
            for (int k =height - i - 1; k > 0; --k) {
                System.out.print(".");
            }
            // sentinal 3
            for (int j = 0; j < i +1; ++j) {
                System.out.print("#");
            }
            System.out.println();
        }

    }
}