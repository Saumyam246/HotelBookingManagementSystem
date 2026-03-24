public class UseCase6RoomAllocation {

    // Reservation class
    static class Reservation {

        private String guestName;
        private String roomId;

        public Reservation(String guestName, String roomId) {
            this.guestName = guestName;
            this.roomId = roomId;
        }

        public String getGuestName() {
            return guestName;
        }

        public String getRoomId() {
            return roomId;
        }
    }

    public static void main(String[] args) {

        System.out.println("Room Allocation Processing");

        // Create reservations
        Reservation r1 = new Reservation("Abhi", "Single-1");
        Reservation r2 = new Reservation("Subha", "Single-2");
        Reservation r3 = new Reservation("Vanmathi", "Suite-1");

        // Print confirmations
        System.out.println(
                "Booking confirmed for Guest: "
                        + r1.getGuestName()
                        + ", Room ID: "
                        + r1.getRoomId()
        );

        System.out.println(
                "Booking confirmed for Guest: "
                        + r2.getGuestName()
                        + ", Room ID: "
                        + r2.getRoomId()
        );

        System.out.println(
                "Booking confirmed for Guest: "
                        + r3.getGuestName()
                        + ", Room ID: "
                        + r3.getRoomId()
        );
    }
}