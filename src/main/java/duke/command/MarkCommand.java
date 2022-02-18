package duke.command;
import duke.task.*;
import duke.util.*;

/**
 * Class stores action to be taken for Mark command.
 */
public class MarkCommand extends Command {

    protected int index;

    public MarkCommand(int index) {
        this.index = index;
    }

    /**
     * Using provided index in this instance of MarkCommand,
     * marks the task at given index, then displays using Ui
     * the notification of the marking.
     *  @param tasklist list of tasks.
     * @param ui this instance of ui (which has open scanner).
     * @param storage instance of storage with chosen filepath.
     * @return String to be displayed in response
     */
    public String execute(TaskList tasklist, Ui ui, Storage storage) {
        Task tsk = tasklist.get(index);
        tsk.mark();
        return Ui.mark(tsk);
    }
}
