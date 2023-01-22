import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//        for (Integer i=1;i<=100;i++){
//            TextThread textThread = new TextThread(i);
//            textThread.start();
//        }
//        IntStream.range(1,101).forEach(s->new TextThread(Integer.valueOf(s)).start());

        ExecutorService executor = Executors.newCachedThreadPool();
        for (Integer i=1;i<=100;i++){
            TextThread textThread = new TextThread();
            executor.execute(textThread);
        }
        executor.shutdown();
    }
}