package duke.task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Subclass of Task, Deadline.
 * Has additional information, 'by'.
 */
public class Deadline extends Task {

    protected LocalDate dateTime;
    protected String by;

    public Deadline(String description, String by) {
        super(description);
        this.by = by;
        this.dateTime = LocalDate.parse(by, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + dateTime.format(DateTimeFormatter.ofPattern("MMM d yyyy")) + ")";
    }

    /**
     * Returns string of encoded info of Deadline for storing in txt file
     * in order to save existing Deadlines easily to hard drive.
     *
     * @return String compressed Deadline info to store in txt file.
     */
    public String infoString() {
        return "D/" + super.infoString() + "/" + by;
    }
}