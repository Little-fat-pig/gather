package comtwo.process.method;
/**
 * 为什么使用join方法（使线程等待）
 * 在很多情况下，主线程生成并起动了子线程，如果子线程里要进行大量的耗时的运算，
 * 主线程往往将于子线程之前结束，但是如果主线程处理完其他的事务后，
 * 需要用到子线程的处理结果，也就是主线程需要等待子线程执行完成之后再结束，
 * 这个时候就要用到join()方法了。
 */
public class Usejoin implements Runnable{
    private String name;
    public Usejoin(String name){
//        super(name);
        this.name=name;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程运行开始！");
        for (int i = 0; i < 7; i++) {
            System.out.println("子进程" + name + "运行：" + i);
            try {
                Thread.sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "线程运行结束！");
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"主线程运行开始！");
        Runnable usejoin=new Usejoin("A");
        Runnable usejoin1=new Usejoin("B");
        Thread t=new Thread(usejoin);
        Thread t1=new Thread(usejoin1);
        t.start();
        t1.start();
//        try {
//            t.join();
//            t1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(Thread.currentThread().getName()+"主线程运行结束！");

    }



}
