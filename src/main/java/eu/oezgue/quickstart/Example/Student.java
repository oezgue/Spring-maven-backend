package eu.oezgue.quickstart.Example;

public class Student {
    String name = "Patrick";

    public Student (String name){
        this.name = name;
    }

    public void sprich(){
        System.out.println("ich bin der Student " + this.name);
    }
}
