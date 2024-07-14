package Mediator;

import java.util.ArrayList;
import java.util.Random;

public class Controller implements Mediator{

    private ArrayList<Student> studentsmarks=new ArrayList<>();
    @Override
    public void sendScript(Teacher teacher) {
        this.studentsmarks=teacher.getStudentsmarks();
    }

    @Override
    public void sendError(Student student) {
        for(Student s:studentsmarks){
            if(student.getId()==s.getId()){
                System.out.println("Mistake happened in marks of student id: "+s.getId());
                studentsmarks.remove(s);
                errorHandlerWithoutcondition(s);
                break;
            }
        }
    }

    public ArrayList<Student> getStudentsmarks() {
        return studentsmarks;
    }

    public void setStudentsmarks(ArrayList<Student> studentsmarks) {
        this.studentsmarks = studentsmarks;
    }

    public void publishmarks(){
        for(Student s:studentsmarks){
            System.out.println(s.getId()+": "+s.getMark());
        }
    }
    public void errorHandler(Student student){

        System.out.println("Reexamine Request got from student id "+student.getId());
        Random random = new Random();
        int rand = 0;
        while (true) {
            rand = random.nextInt(5);
            if (rand != 5) break;
        }
        //System.out.println("rand is"+rand);
        if(student.getId()==studentsmarks.get(rand).getId()){
            studentsmarks.remove(student);
            if(student.getMark()+8>100){
                int x=student.getMark();
                student.setMark(100);
                System.out.println("Marks changed from "+x+" to "+student.getMark());
                studentsmarks.add(student);
            }else {
                student.setMark(student.getMark()+8);
                System.out.println("Marks changed from "+(student.getMark()-8)+" to "+student.getMark());
                studentsmarks.add(student);
            }
        }else {
            System.out.println("Marks didn't change");
        }
    }
    public void errorHandlerWithoutcondition(Student student){
        if(student.getMark()+8>100){
            int x=student.getMark();
            student.setMark(100);
            System.out.println("Marks changed from "+x+" to "+student.getMark());
            studentsmarks.add(student);
        }else {
            student.setMark(student.getMark()+8);
            System.out.println("Marks changed from "+(student.getMark()-8)+" to "+student.getMark());
            studentsmarks.add(student);
        }

    }
}
