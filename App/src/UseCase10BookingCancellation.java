import java.util.ArrayList;

public class UseCase10BookingCancellation {

    // Reservation class matching your existing structure
    static class Reservation {
        private String reservationID;
        private String roomType;

        public Reservation(String reservationID, String roomType) {
            this.reservationID = reservationID;
            this.roomType = roomType;
        }

        public String getReservationID() {
            return reservationID;
        }

        public String getRoomType() {
            return roomType;
        }
    }

    public static void main(String[] args) {
        // Initial inventory setup
        int singleRoomAvailability = 5;

        // Setup a list to track cancelled/released bookings (Rollback History)
        ArrayList<Reservation> rollbackHistory = new ArrayList<>();

        // Simulate a cancellation for a specific booking
        String cancelledRoomType = "Single";
        String reservationIDToRelease = "Single-1";

        System.out.println("Booking Cancellation");

        // 1. Process Cancellation
        singleRoomAvailability++; // Restore inventory
        rollbackHistory.add(new Reservation(reservationIDToRelease, cancelledRoomType));

        System.out.println("Booking cancelled successfully. Inventory restored for room type: " + cancelledRoomType);
        System.out.println();

        // 2. Display Rollback History
        System.out.println("Rollback History (Most Recent First):");
        for (Reservation r : rollbackHistory) {
            System.out.println("Released Reservation ID: " + r.getReservationID());
        }
        System.out.println();

        // 3. Display Updated Availability
        System.out.println("Updated Single Room Availability: " + singleRoomAvailability);
    }
}