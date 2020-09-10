package comtwo.process;

public class PoolThread extends Thread{
    public static Thread currentThread(){
        Thread t=new Thread();

        return null;


    }
    public void run(){
        while (true){
            System.out.println("我是线程！");
        }


    }

    public static void main(String[] args) {
        Thread t=new PoolThread();
        t.start();
        //获取线程名称
        System.out.println(t.getName());
        //获取main的线程名称
        System.out.println(Thread.currentThread().getName());
        //获取线程id
        System.out.println(t.getId());
        System.out.println(Thread.currentThread().getId());
        //获取线程的优先级
        System.out.println(t.getPriority());
        System.out.println(Thread.currentThread().getPriority());
        //线程活动状态  boolean
        System.out.println(t.isAlive());
        System.out.println(Thread.currentThread().isAlive());
        //测试线程是否中断 boolean
        System.out.println(t.isInterrupted());
        System.out.println(Thread.currentThread().isInterrupted());
        //判断线程是否是守护线程
        System.out.println(t.isDaemon());
        System.out.println(Thread.currentThread().isDaemon());
        try {
            //等待线程
            t.join();
            //唤醒等待阻塞等线程
            t.notify();
            Thread.sleep(1000);
            //线程暂停
            Thread.yield();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        System.out.println(t);


    }


}
