package comtwo.processpool;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class FixedThreadPool {


    /*线程池newCachedThreadPool的使用  一个缓存线程池，
    供大于求  自动回收空闲线程 ；需大于供  增加新线程
    线程池规模不存在限制*/
    public void query(){
        ExecutorService es=Executors.newCachedThreadPool();
        int num=3;//创建线程数
        for (int i = 0; i < num; i++) {
            es.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }
    }
    /**
     * 创建一个固定长度的线程池，每当提交一个任务就创建一个线程，
     * 直到达到线程池的最大数量，这时线程规模将不再变化，
     * 当线程发生未预期的错误而结束时，线程池会补充一个新的线程。
     */
    public void query1(){
        ExecutorService es=Executors.newFixedThreadPool(1);
        int num=3;
        for (int i = 0; i < num; i++) {
            es.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("再来一个线程！");
                }
            });


        }
    }
    /**
     *  创建了一个固定长度的线程池，而且以延迟或定时的方式来执行任务
     */
    public void query2(){
        ScheduledExecutorService ses=Executors.newScheduledThreadPool(1);
        int num=3;
        for (int i = 0; i < num; i++) {
            ses.schedule(new Runnable() {
                @Override
                public void run() {
                    final long t=System.currentTimeMillis();
                    System.out.println(Thread.currentThread().getName());
                    long t1=System.currentTimeMillis();
                    System.out.println(t1-t);
                }
            },3,TimeUnit.SECONDS);
        }
    }
    /**
     * 这是一个单线程的Executor，它创建单个工作线程来执行任务，
     * 如果这个线程异常结束，会创建一个新的来替代它；
     * 它的特点是能确保依照任务在队列中的顺序来串行执行。
     */
    public void query3(){
        int num=3;
        ExecutorService es=Executors.newSingleThreadExecutor();
        for (int i = 0; i < num; i++) {
            es.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
            System.out.println(Thread.currentThread().getName());
        }

    }
    public static void main(String[] args) {
        FixedThreadPool f=new FixedThreadPool();
//        f.query();
//        f.query1();
//        f.query2();
        f.query3();

    }

}
