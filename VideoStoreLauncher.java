import java.util.Scanner;

public class VideoStoreLauncher {
    public static void main(String[] args) {
        VideoStore videoStore = new VideoStore();
        Scanner scanner = new Scanner(System.in);   

        int choice;
        do {    
            System.out.println("\n=== Video Rental Store ===");
            System.out.println("1. Add Video");
            System.out.println("2. Give Rating");
            System.out.println("3. Check Out Video");
            System.out.println("4. Return Video");
            System.out.println("5. List Inventory");    
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter video title: ");
                    String title = scanner.nextLine();
                    videoStore.addVideo(title);
                    System.out.println("Video '" + title + "' added to inventory.");
                    break;
                case 2:
                    System.out.print("Enter video title: ");
                    String ratingTitle = scanner.nextLine();
                    System.out.print("Enter user rating: ");
                    int userRating = scanner.nextInt();
                    videoStore.receiveRating(ratingTitle, userRating);
                    System.out.println("Rating added for '" + ratingTitle + "'.");
                    break;
                case 3:
                    System.out.print("Enter video title to check out: ");
                    String checkOutTitle = scanner.nextLine();
                    videoStore.checkOut(checkOutTitle);
                    System.out.println("'" + checkOutTitle + "' checked out.");
                    break;
                case 4:
                    System.out.print("Enter video title to return: ");
                    String returnTitle = scanner.nextLine();
                    videoStore.returnVideo(returnTitle);
                    System.out.println("'" + returnTitle + "' returned.");
                    break;
                case 5:
                    System.out.println("\n=== Inventory ===");
                    videoStore.listInventory();
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}

