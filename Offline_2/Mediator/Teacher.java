package Mediator;

import java.util.ArrayList;

public class Teacher {

    private ArrayList<Student> studentsmarks;
    Teacher(){
        studentsmarks=new ArrayList<>();
    }

    public ArrayList<Student> getStudentsmarks() {
        return studentsmarks;
    }

    public void setStudentsmarks(Student student){
        studentsmarks.add(student);
    }
    public void sendscript(Controller controller){
        controller.sendScript(this);
    }

}
