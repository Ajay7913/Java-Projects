import java.util.ArrayList;
import java.util.Scanner;

class Task {
    String description;
    boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public void markAsComplete() {
        isCompleted = true;
    }

    public void markAsIncomplete() {
        isCompleted = false;
    }

    @Override
    public String toString() {
        return (isCompleted ? "[Completed] " : "[Pending] ") + description;
    }
}

public class ToDoListApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\nTo-Do List Application:");
            System.out.println("1. Add Task");
            System.out.println("2. View All Tasks");
            System.out.println("3. Mark Task as Complete");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // To consume newline character left by nextInt()

            switch (choice) {
                case 1: // Add Task
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    tasks.add(new Task(description));
                    System.out.println("Task added successfully.");
                    break;

                case 2: // View All Tasks
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        System.out.println("Your To-Do List:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3: // Mark Task as Complete
                    System.out.print("Enter task number to mark as complete: ");
                    int completeTaskIndex = scanner.nextInt() - 1;
                    if (completeTaskIndex >= 0 && completeTaskIndex < tasks.size()) {
                        tasks.get(completeTaskIndex).markAsComplete();
                        System.out.println("Task marked as complete.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 4: // Delete Task
                    System.out.print("Enter task number to delete: ");
                    int deleteTaskIndex = scanner.nextInt() - 1;
                    if (deleteTaskIndex >= 0 && deleteTaskIndex < tasks.size()) {
                        tasks.remove(deleteTaskIndex);
                        System.out.println("Task deleted successfully.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 5: // Exit
                    System.out.println("Exiting the To-Do List application. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
