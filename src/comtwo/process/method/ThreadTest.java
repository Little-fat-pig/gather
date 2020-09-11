package comtwo.process.method;

public class ThreadTest {

    public static void main(String[] args) {
        Account account = new Account("123456", 0);

        Thread drawMoneyThread = new DrawMoneyThread("取钱线程", account, 700);
        Thread depositeMoneyThread = new DepositeMoneyThread("存钱线程", account, 700);

        drawMoneyThread.start();
        depositeMoneyThread.start();
    }
}
