import java.util.Scanner;

class RealEstateAgent {
    private String location;
    private String typeOfPlot;
    private String size;
    private String brand;

    public void enterLocation(String location) {
        this.location = location;
    }

    public void enterTypeOfPlot(String typeOfPlot) {
        this.typeOfPlot = typeOfPlot;
    }

    public void enterSize(String size) {
        this.size = size;
    }

    public void enterBrand(String brand) {
        this.brand = brand;
    }

    public void calculateAndDisplaySpecificationsAndPrice() {
        // Add your calculation logic here based on the user's choices
        System.out.println("Specifications:");
        System.out.println("Location: " + location);
        System.out.println("Type of Plot: " + typeOfPlot);
        System.out.println("Size: " + size);
        System.out.println("Brand: " + brand);
        // Display calculated price here.
    }
}

public class RE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RealEstateAgent agent = new RealEstateAgent();

        // Step 1: Get user input for location
        System.out.print("Enter the location (Mumbai, Pune, Nashik): ");
        String location = scanner.nextLine();

        // Step 2: Get user input for type of plot
        System.out.print("Enter the type of plot (House, Plot, Business Plot): ");
        String typeOfPlot = scanner.nextLine();

        // Step 3: Get user input for size
        System.out.print("Enter the size (200 sqft, 550 sqft, 700 sqft): ");
        String size = scanner.nextLine();

        // Step 4: Get user input for brand
        System.out.print("Enter the brand (Lodha, Marathon, Emporium): ");
        String brand = scanner.nextLine();

        // Step 5: Set user choices in the RealEstateAgent
        agent.enterLocation(location);
        agent.enterTypeOfPlot(typeOfPlot);
        agent.enterSize(size);
        agent.enterBrand(brand);

        // Step 6: Calculate specifications and display results
        agent.calculateAndDisplaySpecificationsAndPrice();

        scanner.close();
    }
}
