class ThreadA extends Thread{
public void run(){
System.out.println(Thread.currentThread().getName());
}
}
class ThreadB extends Thread{
public void run(){
System.out.println(Thread.currentThread().getName());
}
}
public class OperatingSystem {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        a.start();
        ThreadB b = new ThreadB();
        b.setName("B");
        b.run();
      
    }
    
}
