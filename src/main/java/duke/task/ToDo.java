package duke.task;

public class ToDo extends Task {

    public ToDo(String description) {
        super(description);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }

    /**
     * Returns string of encoded info of Todo for storing in txt file
     * in order to save existing Todo easily to hard drive.
     *
     * @return String compressed Todo info to store in txt file.
     */
    public String infoString() {
        return "T/" + super.infoString();
    }
}
