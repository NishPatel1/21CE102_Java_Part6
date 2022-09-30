public class TheradExample extends Thread{

    TheradExample() {}
    
    TheradExample(String s){
        super(s);
    }

    @Override
    public void run() {
        System.out.println("Hello world");
    }
}