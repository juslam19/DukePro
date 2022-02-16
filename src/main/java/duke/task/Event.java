package duke.task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Subclass of Task, Event.
 * Has additional information, 'at'.
 */
public class Event extends Task {

    protected LocalDate dateTime;
    protected String at;

    public Event(String description, String at) {
        super(description);
        this.at = at;
        this.dateTime = LocalDate.parse(at, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at: " + dateTime.format(DateTimeFormatter.ofPattern("MMM d yyyy")) + ")";
    }

    /**
     * Returns string of encoded info of Event for storing in txt file
     * in order to save existing Events easily to hard drive.
     *
     * @return String compressed Event info to store in txt file.
     */
    public String infoString() {
        return "D/" + super.infoString() + "/" + at;
    }
}
