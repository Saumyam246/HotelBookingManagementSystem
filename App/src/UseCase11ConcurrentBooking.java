public class UseCase11ConcurrentBooking {

    // Shared Inventory counters
    static int singleCount = 5;
    static int doubleCount = 3;
    static int suiteCount = 2;

    // Booking Task Class
    static class BookingTask implements Runnable {
        private String guestName;
        private String roomType;
        private String roomID;

        public BookingTask(String guestName, String roomType, String roomID) {
            this.guestName = guestName;
            this.roomType = roomType;
            this.roomID = roomID;
        }

        @Override
        public void run() {
            // Synchronized block ensures inventory is updated safely during concurrency
            synchronized (UseCase11ConcurrentBooking.class) {
                if (roomType.equals("Single")) singleCount--;
                else if (roomType.equals("Double")) doubleCount--;
                else if (roomType.equals("Suite")) suiteCount--;

                System.out.println("Booking confirmed for Guest: " + guestName + ", Room ID: " + roomID);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Concurrent Booking Simulation");

        // Create separate threads for each booking to simulate concurrency
        Thread t1 = new Thread(new BookingTask("Abhi", "Single", "Single-1"));
        Thread t2 = new Thread(new BookingTask("Vanmathi", "Double", "Double-1"));
        Thread t3 = new Thread(new BookingTask("Kural", "Suite", "Suite-1"));
        Thread t4 = new Thread(new BookingTask("Subha", "Single", "Single-2"));

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Wait for all threads to finish before printing inventory
        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println();
        System.out.println("Remaining Inventory:");
        System.out.println("Single: " + singleCount);
        System.out.println("Double: " + doubleCount);
        System.out.println("Suite: " + suiteCount);
    }
}