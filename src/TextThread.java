public class TextThread extends Thread {
    private Integer number;

    public TextThread(Integer number) {
        this.number = number;
    }

    @Override
    public void run() {
     System.out.println("Print " + number+ Thread.currentThread().getName());
    }
}
