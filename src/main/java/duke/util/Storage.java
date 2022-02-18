package duke.util;

import duke.task.*;

import java.io.*;
import java.util.*;

/**
 * Handles loading and saving of tasks into and from the
 * TaskList from a specified filepath in the hard drive.
 */
public class Storage {

    protected String filepath;

    /**
     * Constructor
     *
     * @param filepath string for storage file location.
     */
    public Storage(String filepath) {
        this.filepath = filepath;
    }

    /**
     * Tries to create new file at filepath location
     */
    public void createFile() {
        try {
            File file = new File(filepath);
            file.getParentFile().mkdirs();
            if (file.createNewFile()) {
                System.out.println("New File created\n");
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    /**
     * Tries to save tasklist tasks into chosen file
     * at filepath in form strings in a txt file.
     *
     * @param list the list to be saved into the file.
     */
    public void save(TaskList list) {
        try {
            FileWriter writer = new FileWriter(filepath);
            for (int i = 0; i < list.size(); i++) {
                Task tsk = list.get(i);
                writer.write(tsk.infoString() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    /**
     * Tries to load from the file at filepath the tasks
     * to populate tasklist with previously saved tasks.
     *
     * @param list the list to be populated with previously saved tasks.
     */
    public void load(TaskList list) {
        try {
            File file = new File(filepath);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String task = sc.nextLine();
                String[] details = task.split("/");

                Task constructed;

                if (details[0].equals("T")) {
                    constructed = new ToDo(details[2]);
                } else if (details[0].equals("D")) {
                    constructed = new Deadline(details[2], details[3]);
                } else {
                    constructed = new Event(details[2], details[3]);
                }

                if (details[1].equals("1")) {
                    constructed.mark();
                }

                list.add(constructed);
            }
            sc.close();
            System.out.println("File Loaded\n");
        } catch (FileNotFoundException e) {
            createFile();
        }
    }
}