public class Task {
    public String titla;
    public boolean done;

    public Task(String titla) {
        this.titla = titla;
        this.done = false;
    }
    public void  makeDone(){
        this.done = true;

    }
    @Override
    public  String toString(){
        return String.format("%s %s",this.titla,this.done?"СДЕЛАНА":"В ПРОЦЕССЕ");
    }
}
