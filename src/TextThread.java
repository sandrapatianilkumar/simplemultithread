public class TextThread implements  Runnable {
    private Integer number;

    @Override
    public void run() {
     System.out.println("Print " + number+ Thread.currentThread().getName());
    }
}
