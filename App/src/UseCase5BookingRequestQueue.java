import java.util.LinkedList;
import java.util.Queue;

public class UseCase5BookingRequestQueue {

    // Reservation class
    static class Reservation {

        private String guestName;
        private String roomType;

        public Reservation(String guestName, String roomType) {
            this.guestName = guestName;
            this.roomType = roomType;
        }

        public String getGuestName() {
            return guestName;
        }

        public String getRoomType() {
            return roomType;
        }
    }

    // BookingRequestQueue class
    static class BookingRequestQueue {

        private Queue<Reservation> queue = new LinkedList<>();

        public void addRequest(Reservation r) {
            queue.add(r);
        }

        public boolean hasPendingRequests() {
            return !queue.isEmpty();
        }

        public Reservation processRequest() {
            return queue.poll();
        }
    }

    // Main method
    public static void main(String[] args) {

        // Header
        System.out.println("Booking Request Queue");

        // Create queue
        BookingRequestQueue bookingQueue = new BookingRequestQueue();

        // Create reservations
        Reservation r1 = new Reservation("Abhi", "Single");
        Reservation r2 = new Reservation("Subha", "Double");
        Reservation r3 = new Reservation("Vanmathi", "Suite");

        // Add requests
        bookingQueue.addRequest(r1);
        bookingQueue.addRequest(r2);
        bookingQueue.addRequest(r3);

        // Process in FIFO
        while (bookingQueue.hasPendingRequests()) {

            Reservation r = bookingQueue.processRequest();

            System.out.println(
                    "Processing booking for Guest: "
                            + r.getGuestName()
                            + ", Room Type: "
                            + r.getRoomType()
            );
        }
    }
}