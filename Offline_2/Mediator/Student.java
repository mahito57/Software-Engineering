package Mediator ;

class Student  {
    private int id;
    private int mark;
    Student(int id,int mark){
        this.id=id;
        this.mark=mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void reexamine(Controller controller){
        System.out.println("Reexamin request sent from student id "+this.getId());
        controller.errorHandler(this);
    }
}
