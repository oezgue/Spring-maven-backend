package eu.oezgue.quickstart.Example;

public class Mensch {
    Student student;

    public Mensch (){
        this.student = new Student("Patrick");
    }


    public void sprich(){
        System.out.println("ich bin ein Mensch");
        student.sprich();
    }
}
