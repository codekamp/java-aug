package codekamp;

public class Demo implements Runnable {

    volatile public int groundFloorFlats = 10;
    public int[] bookingsTimes;

    public static void main(String[] args) {

        Thread otherThread = new Thread(new Demo());
        otherThread.setName("other");
        otherThread.start();

        Demo.callDelhiPeople();
        Demo.callNoidaPeople();
    }

    public static void callDelhiPeople() {
        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + " Calling delhi person " + i);
        }
    }

    synchronized public static void callNoidaPeople() {
        for (int i = 1; i <= 30; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + " Calling Noida person " + i);
        }
    }

    @Override
    public void run() {
        Demo.callNoidaPeople();
        System.out.println("hello world!");
    }
}