import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by ab.cherkashin on 24.03.2017.
 */
public class LiftOff implements Runnable {
    protected int countDown = 10; // Значение по умолчанию
    private static int taskCount = 0;
    private final int id = taskCount++;
    public LiftOff() {}
    public LiftOff(int countDown) {
        this.countDown = countDown;
    }
    public String status() {
        return "#" + id + "(" +
                (countDown > 0 ? countDown : "Liftoff!") + "), ";
    }
    public void run() {
        while(countDown-- > 0) {
            System.out.print(status());
            Thread.yield();
        }
    }

    static {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for(int i = 0; i < 5; i++)
                exec.execute(new LiftOff());
        exec.shutdown();
    }


    public static void main(String[] args) {
        LiftOff liftOff = new LiftOff(20);

        new Thread(liftOff, "111").start();
    }
}