public class Main {
    private static int[] numbers = {22, 13, 10, 80, 19, 54, 51, 81, 30, 99, 91, 73, 65, 36, 35, 74, 82, 12, 43, 6};
    public static void main(String[] args) {
        Sorted_Numbers sorted = new Sorted_Numbers(20);
        for (int i = 0; i<numbers.length; i++){
            sorted.addNumber(numbers[i]);
        }
    }

    }

