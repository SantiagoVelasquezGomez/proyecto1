import java.util.ArrayList;
import java.util.List;

public class Question {
    private int id;
    private int assemblyId;
    private String text;
    private List<Answer> answers = new ArrayList<>();

    // Constructor
    public Question(int id, int assemblyId, String text) {
        this.id = id;
        this.assemblyId = assemblyId;
        this.text = text;
    }

    // Métodos
    public void createQuestion(int assemblyId, String text) {
        // Implementación para crear una pregunta
    }

    public void updateQuestion(int id, int assemblyId, String text) {
        // Implementación para actualizar una pregunta
    }

    public void deleteQuestion(int id) {
        // Implementación para eliminar una pregunta
    }

    public void addAnswer(Answer answer) {
        answers.add(answer);
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getAssemblyId() { return assemblyId; }
    public void setAssemblyId(int assemblyId) { this.assemblyId = assemblyId; }
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
    public List<Answer> getAnswers() { return answers; }
}
