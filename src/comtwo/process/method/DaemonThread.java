package comtwo.process.method;

public class DaemonThread {
    public static void main(String[] args) {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                Thread childThrea= new Thread(new ChildThread());
                //设置当前线程是否为守护线程
                childThrea.setDaemon(false);
                childThrea.start();
                System.out.println("我是主线程！");
            }
        });
        t.run();
    }
}
