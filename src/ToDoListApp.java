import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        boolean quit = false;

        while (!quit) {
            System.out.println("Choose an option: (1) Add Task (2) Remove Task (3) Mark Task Complete (4) List Tasks (5) Quit");
            int action = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (action) {
                case 1: // Add Task
                    System.out.println("Enter a description for the new task:");
                    String description = scanner.nextLine();
                    toDoList.addTask(description);
                    break;
                case 2: // Remove Task
                    System.out.println("Enter the index of the task to remove:");
                    int removeIndex = scanner.nextInt();
                    toDoList.removeTask(removeIndex);
                    break;
                case 3: // Complete Task
                    System.out.println("Enter the index of the task to mark as complete:");
                    int completeIndex = scanner.nextInt();
                    toDoList.completeTask(completeIndex);
                    break;
                case 4: // List Tasks
                    toDoList.printTasks();
                    break;
                case 5: // Quit
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid option, please choose again.");
            }
        }

        scanner.close();
        System.out.println("Thank you for using the To-Do List App!");
    }
}

