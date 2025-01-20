package eu.oezgue.quickstart.Example;

public class Student {
    String name;

    public Student (String name){
        this.name = name;
    }


    public void sprich(){
        System.out.println("ich heiße: " + this.name);
    }
}
