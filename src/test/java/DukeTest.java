import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import duke.task.*;

public class DukeTest {

    @Test
    public void markTest(){
        Task task = new Task("sample");
        task.mark();
        assertEquals(task.isDone(), true);
    }

    @Test
    public void addRemoveTest() {
        Task task = new Task("sample");
        TaskList list = new TaskList();
        for (int i = 0; i < 50; i++) {
            list.add(task);
        }
        for (int i = 0; i < 20; i++) {
            list.delete(1);
        }
        assertEquals(list.size(), 30);
    }

    @Test
    public void markedEvent_toString() {
        Event event = new Event("party", "2019-10-02");
        event.mark();
        assertEquals(event.toString(), "[E][X] party (at: Oct 2 2019)");
    }

    @Test
    public void altmarkedEvent_infoString() {
        Event event = new Event("party", "2019-10-02");
        event.mark();
        event.unmark();
        assertEquals(event.infoString(), "D/0/party/2019-10-02");
    }
}
