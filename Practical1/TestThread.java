public class TestThread {
    public static void main(String[] args) {
        TheradExample First = new TheradExample();
        TheradExample Second = new TheradExample();
        TheradExample Third = new TheradExample();

        First.setPriority(3);
        Third.setPriority(7);

        System.out.println("Priority of First Thread is " + First.getPriority());
        System.out.println("Priority of Second Thread is " + Second.getPriority());
        System.out.println("Priority of Third Thread is " + Third.getPriority());
    }
}
