public class Countdown {
    int size;

    public Countdown(int size) {
        this.size = size;
    }

    public void run() {
        for (int i = 0; i < size; i++) {
            System.out.println(i);
        }
    }
}
