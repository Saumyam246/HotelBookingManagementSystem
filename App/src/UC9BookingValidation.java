import java.util.Scanner;
import java.util.ArrayList;

public class UC9BookingValidation {

    // Reservation class (Same structure as your UC8)
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
        Scanner scanner = new Scanner(System.in);
        ArrayList<Reservation> history = new ArrayList<>();

        System.out.println("Booking Validation");

        // Input Guest Name
        System.out.print("Enter guest name: ");
        String name = scanner.nextLine();

        // Input Room Type
        System.out.print("Enter room type (Single/Double/Suite): ");
        String type = scanner.nextLine();

        // Validation Logic
        // Note: Using .equals() makes it case-sensitive (e.g., "single" will fail)
        if (type.equals("Single") || type.equals("Double") || type.equals("Suite")) {

            // If valid, add to history list
            history.add(new Reservation(name, type));
            System.out.println("Booking successful for " + name + "!");

        } else {
            // This matches the error message in your image
            System.out.println("Booking failed: Invalid room type selected.");
        }

        scanner.close();
    }
}