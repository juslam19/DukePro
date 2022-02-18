package duke.util;

import duke.command.DukeException;
import duke.task.Task;
import duke.task.TaskList;

/**
 * Responsible for getting input from user, as well as displaying
 * notifications to user notifying them of Duke's status.
 */
public class Ui {

//    FastIO sc;
//
//    /**
//     * Constructor
//     */
//    public Ui() {
//        this.sc = new FastIO();
//    }
//
//
//    /**
//     * Returns command that was typed in by user.
//     *
//     * @return String command that was read from input.
//     */
//    public String readCommand() {
//        String command = sc.nextLine();
//        return command;
//    }



    // Welcome and Bye
    /**
     * Displays welcome message to user.
     */
    public static String showWelcome() {
        return "Hello there, I'm Duke! Let's chat!";
    }

    /**
     * Displays bye message to user, and closes scanner.
     */
    public static String bye() {
        return "Bye! It was nice having you!";
    }


    // List out tasks
    /**
     * Takes in TaskList and prints out the numbered list.
     *
     * @param list TaskList containing inputted/previously inputted tasks.
     */
    public static String list(TaskList list) {
        String str = "Here are the tasks in your list: \n";
        for (int i = 0; i < list.size(); i++) {
            str = str.concat(i + 1 + ". " + list.get(i).toString() + "\n");
        }
        return str;
    }

    // Filter
    public static String filter(TaskList list, String substring) {
        String str = "Here's what I found: \n";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDetail().contains(substring)) {
                str.concat(i + 1 + ". " + list.get(i).toString() + "\n");
            }
        }
        return str;
    }


    // Prints exceptions
    /**
     * Takes in a DukeException and prints out error message.
     *
     * @param e DukeException which was thrown and caught.
     */
    public String printException(DukeException e) {
        return e.getMessage();
    }


    // Mark, Unmark, Delete
    /**
     * Displays mark message, and shows task marked to user.
     */
    public static String mark(Task task) {
        return "Nice! I've marked this task as done: \n" + task.toString();
    }

    /**
     * Displays unmark message, and shows task unmarked to user.
     */
    public static String unmark(Task task) {
        return "OK, I've marked this task as not done yet: \n" + task.toString();
    }
    
    /**
     * Displays delete message, and shows task deleted to user.
     */
    public static String delete(Task task, int size) {
        return "Noted. I've removed this task: \n" + task.toString() + "\nNow you have " + size + " tasks in the list.";
    }


    // Add task
    /**
     * Displays add message, and shows task added to user.
     */
    public static String add(Task task, int size) {
        return "Got it. I've added this task: \n" + task.toString() + "\nNow you have " + size + " tasks in the list.";
    }

}
