package comtwo.process.method;

import java.util.concurrent.TimeUnit;

public class ChildThread implements Runnable {
    @Override
    public void run() {
        while (true){
            System.out.println("我是子线程！");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
