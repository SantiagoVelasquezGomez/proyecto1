import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Assembly {

    private int id;
    private String name;
    private LocalDateTime date;
    private List<Question> questions = new ArrayList<>();
    private List<Attendee> attendees = new ArrayList<>();

    // Constructor
    public Assembly(int id, String name, LocalDateTime date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    // Métodos
    public void createAssembly(String name, LocalDateTime date) {
        // Implementación para crear una asamblea
    }

    public void deleteAssembly(int id) {
        // Implementación para eliminar una asamblea
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void addAttendee(Attendee attendee) {
        attendees.add(attendee);
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public LocalDateTime getDate() { return date; }
    public void setDate(LocalDateTime date) { this.date = date; }
    public List<Question> getQuestions() { return questions; }
    public List<Attendee> getAttendees() { return attendees; }
}

