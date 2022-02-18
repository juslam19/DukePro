package duke.util;

import duke.command.*;

/**
 * Has only one method, which:
 * Parses the inputted commands to determine which subclass of
 * command to use, then further parsed to get the parameters to be
 * passed into the constructors of those subclasses of commands,
 * which is then returned to effectively have a thing storing the
 * intended command with the intended parameters.
 */
public class Parser {

    /**
     * Returns an instance of a subclass of Command with parameters filled.
     *
     * @param input string that is inputted by user to be parsed
     * @return Command a subclass of Command passed as a Command
     * @throws DukeException missing details, or invalid inputs
     */
    public static Command parse(String input) throws DukeException {

        // Listing command
        if (input.equals("list")) {
            return new ListCommand();

        // Exit command
        } else if (input.equals("bye")) {
            return new ExitCommand();


        // Other commands
        } else {
            // Getting first word
            String[] words = input.split(" ", 2);
            String category = words[0];


            // Mark,unmark,delete
            if (category.equals("mark") || category.equals("unmark") || category.equals("delete")) {
                int index = Integer.parseInt(words[1]) - 1;
                if (category.equals("mark")) {
                    return new MarkCommand(index);
                } else if (category.equals("unmark")) {
                    return new UnmarkCommand(index);
                } else {
                    return new DeleteCommand(index);
                }

            // Search
            } else if (category.equals("find")) {
                String substring = words[1];
                return new SearchCommand(substring);


            //Adding tasks
            } else {

                // Throw Exception for missing details
                if (words.length == 1 && (category.equals("todo") || category.equals("deadline") || category.equals("event"))) {
                    throw new DukeException("Sorry, the task description can't be empty. Try again.");
                }


                // Finding out the types of task
                if (category.equals("todo")) {
                    return new AddCommand("T", words[1], null);
                } else if (category.equals("deadline")) {
                    String[] details = words[1].split(" /by ", 0);
                    System.out.println(details[1]);
                    return new AddCommand("D", details[0], details[1]);

                } else if (category.equals("event")) {
                    String[] details = words[1].split(" /at ", 0);
                    System.out.println(details[0]);
                    return new AddCommand("E", details[0], details[1]);


                // Invalid command
                } else {
                    throw new DukeException("I'm not sure I understand. Try again with proper format for commands.");
                }
            }
        }
    }
}
