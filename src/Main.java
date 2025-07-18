import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FactoryController controller = new FactoryController();

        controller.addMachine(new Machine("Molding Machine 1"));
        controller.addMachine(new Machine("Conveyor Belt 1"));
        controller.addMachine(new Machine("Inspection Unit"));

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Factory Equipment Control Menu ===");
            System.out.println("1. Start All Machines");
            System.out.println("2. Stop All Machines");
            System.out.println("3. Reset All Machines");
            System.out.println("4. Show Machine Status");
            System.out.println("5. Simulate Random Machine Fault");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    controller.startAll();
                    break;
                case 2:
                    controller.stopAll();
                    break;
                case 3:
                    controller.resetAll();
                    break;
                case 4:
                    controller.showStatus();
                    break;
                case 5:
                    controller.simulateRandomFault();
                    break;
                case 0:
                    System.out.println("Exiting system.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}
