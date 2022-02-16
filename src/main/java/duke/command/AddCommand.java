package duke.command;
import duke.task.*;
import duke.util.*;

/**
 * Class stores action to be taken for Add command.
 */
public class AddCommand extends Command {

    protected String type;
    protected String details;
    protected String time;

    public AddCommand(String type, String details, String time) {
        this.type = type;
        this.details = details;
        this.time = time;
    }

    /**
     * Determines task's type, then creates a new instance of class
     * task type, subclass of task, before adding to tasklist.
     * Then displays add notification to user using Ui.
     *
     * @param tasklist list of tasks.
     * @param ui this instance of ui (which has open scanner).
     * @param storage instance of storage with chosen filepath.
     */
    public void execute(TaskList tasklist, Ui ui, Storage storage) {
        if (type.equals("T")) {
            ToDo item = new ToDo(details);
            tasklist.add(item);
            Ui.add(item, tasklist.size());
        } else if (type.equals("D")) {
            Deadline item = new Deadline(details, type);
            tasklist.add(item);
            Ui.add(item, tasklist.size());
        } else if (type.equals("E")) {
            Event item = new Event(details, type);
            tasklist.add(item);
            Ui.add(item, tasklist.size());
        }
    }
}
