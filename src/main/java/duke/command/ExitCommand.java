package duke.command;
import duke.task.*;
import duke.util.*;

/**
 * Class stores action to be taken for Exit command.
 */
public class ExitCommand extends Command {

    /**
     * Doesn't do anything.
     *
     * @param tasklist list of tasks.
     * @param ui this instance of ui (which has open scanner).
     * @param storage instance of storage with chosen filepath.
     */
    public void execute(TaskList tasklist, Ui ui, Storage storage) {
    }
}
