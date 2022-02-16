package duke.task;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Class of Task, stores 2 info: details and if done
 */
public class Task implements Serializable {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    public void mark() {
        isDone = true;
    }

    public void unmark() {
        isDone = false;
    }

    @Override
    public String toString() {
        return "[" + getStatusIcon() + "] " + description;
    }

    /**
     * Returns string of encoded info of Task for storing in txt file
     * in order to save existing Task easily to hard drive.
     *
     * @return String compressed Task info to store in txt file.
     */
    public String infoString() {
        return (isDone? 1: 0) + "/" + description;
    }
}
