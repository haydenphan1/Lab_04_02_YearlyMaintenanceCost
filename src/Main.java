public class Main {

    public static void main(String[] args)
    {

        // Declarations
        double springCost;
        double summerCost;
        double fallCost;
        double winterCost;
        double totalCost;

        // Prompt user for data entry
        System.out.println("Enter the maintenance cost of the spring: ");
        // Simulate user input
        System.out.println("110");
        springCost = 110;

        // Prompt user for data entry
        System.out.println("Enter the maintenance cost of the summer: ");
        // Simulate user input
        System.out.println("200");
        summerCost = 200;

        // Prompt user for data entry
        System.out.println("Enter the maintenance cost of the fall: ");
        // Simulate user input
        System.out.println("150");
        fallCost = 150;

        // Prompt user for data entry
        System.out.println("Enter the maintenance cost of the winter: ");
        // Simulate user input
        System.out.println("250");
        winterCost = 250;

        // Calculate and display the total maintenance costs
        totalCost = springCost + summerCost + fallCost + winterCost;
        System.out.println("The maintenance cost for spring is " + springCost + ".");
        System.out.println("The maintenance cost for summer is " + summerCost + ".");
        System.out.println("The maintenance cost for fall is " + fallCost + ".");
        System.out.println("The maintenance cost for winter is " + winterCost + ".");
        System.out.println("The total yearly maintenance cost is " + totalCost + ".");

    }
}