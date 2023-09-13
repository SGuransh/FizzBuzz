import java.util.Scanner;

public class Reduce {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give the number that you want to reduce: ");
        String number = scan.nextLine();
        Integer i = Integer.valueOf(number);
        int steps = 0;
        while (i != 0){
            if (i % 2 == 0){
                i = i / 2;
                steps ++;
            }
            else {
                i --;
                steps ++;
            }
        }
        System.out.println(steps);
    }
}
