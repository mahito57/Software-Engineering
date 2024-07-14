package Component;

public class Developer implements Component {

    String name;
    ProjectManager projectManager;

    Developer(String name, ProjectManager projectManager) {
        this.name = name;
        this.projectManager = projectManager;
        this.projectManager.addDeveloper(this);
    }

    @Override
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Role: Developer");
        System.out.println("Current Project: " + projectManager.getProjectname());
    }

    @Override
    public void showHierarchy() {
        System.out.print("\t");
        System.out.println("- "+name);
    }

    @Override
    public void Delete() {
        projectManager.removeDeveloper(this);
        System.out.println("\t"+"Developer "+name+" deleted");
    }
}