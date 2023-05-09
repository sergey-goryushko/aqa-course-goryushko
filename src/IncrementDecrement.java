public class IncrementDecrement {
    static int value = 5;

    static void increment() {
        for (int i = 0; i < value; i++) {
            System.out.println(i);
        }
    }

    static void decrement() {
        for (int j = 10; j > value; j--) {
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        System.out.println("Here is the example of increment.");
        IncrementDecrement.increment();
        System.out.println("Here is the example of decrement.");
        IncrementDecrement.decrement();
    }
}