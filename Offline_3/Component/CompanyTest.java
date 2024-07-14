package Component;

public class CompanyTest {
    public static void main(String[] args) {
        SoftwareCompany google = new SoftwareCompany("Google");
        ProjectManager p1 = new ProjectManager("Sami","AI",google);
        ProjectManager p2 = new ProjectManager("Saddam","ML", google);
        ProjectManager p3 = new ProjectManager("JAmil","EE", google);
        Developer d1 = new Developer("Tomal", p1);
        Developer d2 = new Developer("Sakib", p1);
        Developer d3 = new Developer("Rittik", p2);
        Developer d4 = new Developer("Rocky", p3);

        google.showHierarchy();
        google.display();
        p1.showHierarchy();
        p1.display();
        d3.display();
        p1.Delete();
        google.showHierarchy();
        google.Delete();
        google.showHierarchy();


    }
}
