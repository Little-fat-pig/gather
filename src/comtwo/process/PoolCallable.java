package comtwo.process;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
/**
 * 创建线程的三种方式和一类线程池
 *1.继承thread类，重写run方法，否则没有价值
 * 2.实现runnable接口，实现run方法
 * 3.实现callable接口，重写call方法，有返回值的，前两个没有返回值
 * 需要使用future来包装callable对象，future对象将作为thread的target
 */

public class PoolCallable implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("子线程正在计算");
        Thread.sleep(3000);
        int sum=0;
        for (int i = 0; i < 100; i++) {
            sum+=i;
        }
        System.out.println(Thread.currentThread().getName()+"当前运行的线程的名称！");
        return sum;
    }

    public static void main(String[] args) {
        //创建对象
        Callable pc=new PoolCallable();
        //使用future来包装callable对象
        Future ft=new FutureTask(pc);
        Thread t=new Thread((Runnable) ft);//ft作为thread的target
        t.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程在执行任务！");
        try {
            Object o = ft.get();//获取call的返回结果
            System.out.println(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }finally {
            System.out.println("所有线程执行结束！");
        }
    }
}
