package eu.oezgue.quickstart.Example;

public class Mensch {

    Student student;

    public Mensch (Student student){
        this.student = student;
    }


    public void sprich(){
        System.out.println("ich bin ein Mensch");
        student.sprich();
    }
}
