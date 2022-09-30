public class TestThreadPrc1b {
    public static void main(String[] args) {
        ThreadExaPrac1b b = new ThreadExaPrac1b();
        Thread t = new Thread(b);
        t.start();
    }
}
