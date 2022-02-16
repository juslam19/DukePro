package duke.command;
import duke.task.*;
import duke.util.*;

/**
 * Template for Classes that store action to be
 * taken for their respective commands.
 */
public abstract class Command {

    /**
     * For Method that when called, carries out actions to be taken
     * under the respective command.
     *
     * @param tasklist list of tasks.
     * @param ui this instance of ui (which has open scanner).
     * @param storage instance of storage with chosen filepath.
     */
    public abstract void execute(TaskList tasklist, Ui ui, Storage storage);
}
