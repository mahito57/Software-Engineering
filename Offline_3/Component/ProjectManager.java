package Component;

import java.util.ArrayList;

public class ProjectManager implements Component {
    String name;
    String projectname;
    int superviseeCount = 0;
    SoftwareCompany softwareCompany;

    ProjectManager(String name, String projectname,SoftwareCompany softwareCompany) {
        this.name = name;
        this.projectname = projectname;
        this.softwareCompany=softwareCompany;
        this.softwareCompany.addManager(this);
    }

    ArrayList<Developer> developerList = new ArrayList<>();

    public String getname() {
        return name;
    }

    public String getProjectname() {
        return projectname;
    }

    public void addDeveloper(Developer developer) {
        developerList.add(developer);
        superviseeCount++;
    }

    public void removeDeveloper(Developer developer) {
        developerList.remove(developer);
        superviseeCount--;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Role: Project Manager");
        System.out.println("Current Project: " + projectname);
        System.out.println("Number of supervisees: " + superviseeCount);
    }

    @Override
    public void showHierarchy() {
        System.out.println("- " + name+" ("+projectname+")");
        for (Developer x : developerList) {
            System.out.print("\t");
            x.showHierarchy();
        }
    }

    @Override
    public void Delete() {
        for (int i=0;i<developerList.size();) {
            System.out.print("\t");
            developerList.get(i).Delete();
        }
        softwareCompany.removeManager(this);
        System.out.println("\t"+"Manager "+name+" deleted");
    }
}
