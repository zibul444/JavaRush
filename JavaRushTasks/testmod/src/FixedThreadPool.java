/**
 * Created by Михаил Алексеевич on 08.11.2017.
 */
import java.util.concurrent.*;

public class FixedThreadPool {
    public static void main(String[] args) {
        // В аргументе конструктора передается количество потоков:
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for(int i = 0; i < 5; i++)
            exec.execute(new LiftOff());
        exec.shutdown();
    }

    public static void mai(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i < 5; i++)
            exec.execute(new LiftOff());
        exec.shutdown();
    }
}
