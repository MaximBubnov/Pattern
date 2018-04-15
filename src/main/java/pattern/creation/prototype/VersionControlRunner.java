package pattern.creation.prototype;

public class VersionControlRunner {

    public static void main(String[] args) {

        Project master = new Project(1, "SuperProject", "SourceCode sourceCode = new CourseCode();");

        System.out.println(master);

        //создадим копию этого проекта

        ProjectFactory factory = new ProjectFactory(master);

        Project masterClone = factory.cloneProject();

        System.out.println(masterClone);
    }
}
