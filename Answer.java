import java.time.LocalDateTime;

public class Answer {
    private int id;
    private int questionId;
    private int ownerId;
    private int response;
    private LocalDateTime date;

    // Constructor
    public Answer(int id, int questionId, int ownerId, int response, LocalDateTime date) {
        this.id = id;
        this.questionId = questionId;
        this.ownerId = ownerId;
        this.response = response;
        this.date = date;
    }

    // Métodos
    public void submitAnswer(int questionId, int ownerId, int response, LocalDateTime date) {
        // Implementación para enviar una respuesta
    }

    public void updateAnswer(int id, int questionId, int ownerId, int response, LocalDateTime date) {
        // Implementación para actualizar una respuesta
    }

    public void deleteAnswer(int id) {
        // Implementación para eliminar una respuesta
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getQuestionId() { return questionId; }
    public void setQuestionId(int questionId) { this.questionId = questionId; }
    public int getOwnerId() { return ownerId; }
    public void setOwnerId(int ownerId) { this.ownerId = ownerId; }
    public int getResponse() { return response; }
    public void setResponse(int response) { this.response = response; }
    public LocalDateTime getDate() { return date; }
    public void setDate(LocalDateTime date) { this.date = date; }
}
