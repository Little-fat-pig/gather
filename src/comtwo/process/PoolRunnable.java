package comtwo.process;

public class PoolRunnable implements Runnable{
    @Override
    public synchronized void run() {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"线程数值："+i);
        }
    }

    public static void main(String[] args) {
        Runnable pr=new PoolRunnable();
        Thread t=new Thread(pr,"A");
        Thread t1=new Thread(pr,"B");
//        System.out.println(t.getName());
//        System.out.println(t1.getName());
        t.start();
        t1.start();
        try {
            t.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
