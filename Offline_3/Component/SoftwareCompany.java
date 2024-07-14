package Component;

import java.util.ArrayList;

public class SoftwareCompany implements Component{
    ArrayList<ProjectManager> managerList= new ArrayList<>();
    String name;
    int numOfProjects=0;

    SoftwareCompany(String name){
        this.name=name;
    }

    void addManager(ProjectManager manager){
        managerList.add(manager);
        numOfProjects++;
    }

    void removeManager(ProjectManager manager){
        managerList.remove(manager);
        numOfProjects--;
    }

    @Override
    public void display() {
        System.out.println("Name: "+name);
        System.out.println("Projects: ");
        for(ProjectManager x:managerList){
            System.out.println("\t"+x.getProjectname()+" "+x.getname());
        }
    }

    @Override
    public void showHierarchy() {
        System.out.println("-"+name);
        for(ProjectManager x:managerList){
            System.out.print("\t");
            x.showHierarchy();
        }
    }

    @Override
    public void Delete() {
        for(int i=0;i<managerList.size();){
            managerList.get(i).Delete();
        }
        System.out.println("Company "+name+" deleted");
    }
}
