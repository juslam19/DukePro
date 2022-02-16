package duke.util;

import duke.command.DukeException;
import duke.task.Task;
import duke.task.TaskList;

/**
 * Responsible for getting input from user, as well as displaying
 * notifications to user notifying them of Duke's status.
 */
public class Ui {

    FastIO sc;

    /**
     * Constructor
     */
    public Ui() {
        this.sc = new FastIO();
    }


    /**
     * Returns command that was typed in by user.
     *
     * @return String command that was read from input.
     */
    public String readCommand() {
        String command = sc.nextLine();
        return command;
    }



    // Welcome and Bye
    /**
     * Displays welcome message to user.
     */
    public static void showWelcome() {
        System.out.println("Hello there, I'm Duke! Let's chat!");
    }

    /**
     * Displays bye message to user, and closes scanner.
     */
    public void bye() {
        System.out.println("Bye! It was nice having you!");
        sc.close();
    }


    // List out tasks
    /**
     * Takes in TaskList and prints out the numbered list.
     *
     * @param list TaskList containing inputted/previously inputted tasks.
     */
    public static void list(TaskList list) {
        System.out.println("Here are the tasks in your list: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + ". " + list.get(i).toString());
        }
    }

    // Filter
    public static void filter(TaskList list, String substring) {
        System.out.println("Here's what I found: ");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDetail().contains(substring)) {
                System.out.println(i + 1 + ". " + list.get(i).toString());
            }
        }
    }


    // Prints exceptions
    /**
     * Takes in a DukeException and prints out error message.
     *
     * @param e DukeException which was thrown and caught.
     */
    public void printException(DukeException e) {
        System.out.println("ERROR: " + e.getMessage());
    }


    // Mark, Unmark, Delete
    /**
     * Displays mark message, and shows task marked to user.
     */
    public static void mark(Task task) {
        System.out.println("Nice! I've marked this task as done: \n" + task.toString());
    }

    /**
     * Displays unmark message, and shows task unmarked to user.
     */
    public static void unmark(Task task) {
        System.out.println("OK, I've marked this task as not done yet: \n" + task.toString());
    }
    
    /**
     * Displays delete message, and shows task deleted to user.
     */
    public static void delete(Task task, int size) {
        System.out.println("Noted. I've removed this task: \n" + task.toString() + "\nNow you have " + size + " tasks in the list.");
    }


    // Add task
    /**
     * Displays add message, and shows task added to user.
     */
    public static void add(Task task, int size) {
        System.out.println("Got it. I've added this task: \n" + task.toString() + "\nNow you have " + size + " tasks in the list.");
    }

}
