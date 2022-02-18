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
     *  @param tasklist list of tasks.
     * @param ui this instance of ui (which has open scanner).
     * @param storage instance of storage with chosen filepath.
     * @return String to be displayed in response
     */
    public String execute(TaskList tasklist, Ui ui, Storage storage) {
        if (type.equals("T")) {
            ToDo item = new ToDo(details);
            tasklist.add(item);
            return Ui.add(item, tasklist.size());
        } else if (type.equals("D")) {
            Deadline item = new Deadline(details, time);
            tasklist.add(item);
            return Ui.add(item, tasklist.size());
        } else {
            Event item = new Event(details, time);
            tasklist.add(item);
            return Ui.add(item, tasklist.size());
        }
    }
}
