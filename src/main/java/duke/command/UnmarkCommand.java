package duke.command;
import duke.task.*;
import duke.util.*;

/**
 * Class stores action to be taken for Unmark command.
 */
public class UnmarkCommand extends Command {

    protected int index;

    public UnmarkCommand(int index) {
        this.index = index;
    }

    /**
     * Using provided index in this instance of UnmarkCommand,
     * unmarks the task at given index, then displays using Ui
     * the notification of the unmarking.
     *
     * @param tasklist list of tasks.
     * @param ui this instance of ui (which has open scanner).
     * @param storage instance of storage with chosen filepath.
     */
    public void execute(TaskList tasklist, Ui ui, Storage storage) {
        Task tsk = tasklist.get(index);
        tsk.unmark();
        Ui.unmark(tsk);
    }
}
