public class Multiples {
    public static void main(String[] args) {
        int number = 0;
        for (int i = 1; i < 1000; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            if (divisibleBy3) {
                number += 1;
            } else if (divisibleBy5) {
                number += 1;
            }
        }
        System.out.println(number);
    }
}
