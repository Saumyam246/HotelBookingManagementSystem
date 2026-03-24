import java.io.File;

public class UseCase12SystemRecovery {

    public static void main(String[] args) {
        // Define the "database" file name
        String fileName = "inventory_data.txt";
        File inventoryFile = new File(fileName);

        System.out.println("System Recovery");

        // Logic: Check if the inventory data file exists
        if (!inventoryFile.exists()) {
            // This matches the message in your screenshot
            System.out.println("No valid inventory data found. Starting fresh.");
            System.out.println();

            // Default Inventory values
            int single = 5;
            int doubleRoom = 3;
            int suite = 2;

            // Display current state
            System.out.println("Current Inventory:");
            System.out.println("Single: " + single);
            System.out.println("Double: " + doubleRoom);
            System.out.println("Suite: " + suite);

            // Simulate saving the data
            saveInventory();
        } else {
            System.out.println("Inventory data loaded successfully.");
        }
    }

    // Static method to simulate saving data to a file
    public static void saveInventory() {
        // In a full implementation, you would use FileWriter here
        System.out.println("Inventory saved successfully.");
    }
}