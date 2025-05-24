import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();
        boolean running = true;

        while (running) {
            System.out.println("\n--- To-Do App ---");
            System.out.println("1. Add task");
            System.out.println("2. Show tasks");
            System.out.println("3. Mark task as done");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String desc = scanner.nextLine();
                    tasks.add(new Task(desc));
                    break;
                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter task number to mark done: ");
                    int num = scanner.nextInt();
                    if (num >= 1 && num <= tasks.size()) {
                        tasks.get(num - 1).markDone();
                        System.out.println("Task marked as done.");
                    } else {
                        System.out.println("Invalid number.");
                    }
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        System.out.println("Goodbye!");
    }
}
