public class UseCase7AddOnService {

    // Reservation class
    static class Reservation {

        private String reservationId;
        private double addOnCost;

        public Reservation(String reservationId, double addOnCost) {
            this.reservationId = reservationId;
            this.addOnCost = addOnCost;
        }

        public String getReservationId() {
            return reservationId;
        }

        public double getAddOnCost() {
            return addOnCost;
        }
    }

    public static void main(String[] args) {

        System.out.println("Add-On Service Selection");

        // Create reservation
        Reservation r1 = new Reservation("Single-1", 1500.0);

        System.out.println("Reservation ID: " + r1.getReservationId());
        System.out.println("Total Add-On Cost: " + r1.getAddOnCost());
    }
}