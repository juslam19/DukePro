package duke.task;

import java.util.ArrayList;

/**
 * Stores list of tasks inputted by user into Duke/
 * loaded from previous sessions by external code.
 * Has methods for accessing tasks, and modifying list and task
 * details as per user command.
 */
public class TaskList {

    protected ArrayList<Task> lst;

    public TaskList() {
        this.lst = new ArrayList<Task>();
    }

    /**
     * Adds task to list of tasks
     *
     * @param task task to be added
     */
    public void add(Task task) {
        lst.add(task);
    }

    /**
     * Removes task with selected index from list of tasks.
     *
     * @param index index of task to be deleted.
     */
    public void delete(int index) {
        lst.remove(index);
    }

    public Task get(int index) {
        return lst.get(index);
    }

    public int size() {
        return lst.size();
    }

    public String toString() {
        return lst.toString();
    }
}
