import java.time.LocalDate;

public class Task {

    public String titla;
    public boolean done;

    public String description;

    public LocalDate deadLine;

    public Task(String titla, LocalDate deadLine,String description) {
        this.titla = titla;
        this.deadLine = deadLine;
        this.done = false;
        this.description= description;
    }

    public void makeDone() {
        this.done = true;

    }

    @Override
    public String toString() {
        return String.format("%s %s", this.titla, this.done ? "СДЕЛАНА" : "В ПРОЦЕССЕ");
    }
}
