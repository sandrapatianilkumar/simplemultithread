import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//        for (Integer i=1;i<=100;i++){
//            TextThread textThread = new TextThread(i);
//            textThread.start();
//        }
        IntStream.range(1,101).forEach(s->new TextThread(Integer.valueOf(s)).start());
    }
}