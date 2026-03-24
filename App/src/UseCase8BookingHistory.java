import java.util.ArrayList;

public class UseCase8BookingHistory {

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

    public static void main(String[] args) {

        System.out.println("Booking History and Reporting");
        System.out.println();

        System.out.println("Booking History Report");

        // History list
        ArrayList<Reservation> history = new ArrayList<>();

        history.add(new Reservation("Abhi", "Single"));
        history.add(new Reservation("Subha", "Double"));
        history.add(new Reservation("Vanmathi", "Suite"));

        // Print history
        for (Reservation r : history) {

            System.out.println(
                    "Guest: "
                            + r.getGuestName()
                            + ", Room Type: "
                            + r.getRoomType()
            );
        }
    }
}