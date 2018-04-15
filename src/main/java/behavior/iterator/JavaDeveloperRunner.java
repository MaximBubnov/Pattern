package behavior.iterator;

public class JavaDeveloperRunner {

    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "MySQL"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Maxim Bubnov", skills);

        Iterarot iterarot = javaDeveloper.getIterator();

        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterarot.hasNext()) {
            System.out.println(iterarot.next().toString() + " ");
        }
    }
}
