package duke.command;
import duke.task.*;
import duke.util.*;

/*
* Class which executes actions for "find" command
*/
public class SearchCommand extends Command {

    protected String substring;

    public SearchCommand(String substring) {
        this.substring = substring;
    }

    public String execute(TaskList tasklist, Ui ui, Storage storage) {
        return Ui.filter(tasklist, substring);
    }
}