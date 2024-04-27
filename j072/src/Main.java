import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TodoCRUD todoCRUD = new TodoCRUD();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            System.out.println("1. Add an item");
            System.out.println("2. Update an item");
            System.out.println("3. Delete an item");
            System.out.println("4. Print items sorted by title");
            System.out.println("5. Print items sorted by date");
            System.out.println("6. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter description: ");
                    String description = scanner.nextLine();
                    TodoItem item = new TodoItem(title, description);
                    todoCRUD.addItem(item);
                    break;
                case 2:
                    System.out.print("Enter index of item to update: ");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter new title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter new description: ");
                    String newDescription = scanner.nextLine();
                    TodoItem newItem = new TodoItem(newTitle, newDescription);
                    todoCRUD.updateItem(updateIndex, newItem);
                    break;
                case 3:
                    System.out.print("Enter index of item to delete: ");
                    int deleteIndex = scanner.nextInt();
                    todoCRUD.deleteItem(deleteIndex);
                    break;
                case 4:
                    System.out.println("Items sorted by title:");
                    todoCRUD.printItemsSortedByTitle();
                    break;
                case 5:
                    System.out.println("Items sorted by date:");
                    todoCRUD.printItemsSortedByDate();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

        scanner.close();
    }
}
