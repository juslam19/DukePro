package duke.command;
import duke.task.*;
import duke.util.*;

/**
 * Class stores action to be taken for delete command.
 */
public class DeleteCommand extends Command {

    protected int index;

    public DeleteCommand(int index) {
        this.index = index;
    }

    /**
     * Gets the index of the selected task, displays delete
     * notification to user using Ui, then deletes task from tasklist.
     *  @param tasklist list of tasks.
     * @param ui this instance of ui (which has open scanner).
     * @param storage instance of storage with chosen filepath.
     * @return String to be displayed in response
     */
    public String execute(TaskList tasklist, Ui ui, Storage storage) {
        Task tsk = tasklist.get(index);
        tasklist.delete(index);
        return Ui.delete(tsk, tasklist.size());
    }
}
