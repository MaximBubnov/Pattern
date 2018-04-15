package structual.flyweight;

import java.util.HashMap;
import java.util.Map;

// наш преспобленец
public class DeveloperFactory {

    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpecialty(String specialty) {

        Developer developer = developers.get(specialty);

        if(developer == null) {
            switch (specialty) {
                case "java" :
                    System.out.println("Hiring Java developer ");
                    developer = new JavaDeveloper();
                    break;
                case "c++" :
                    System.out.println("Hiring c++ developer");
                    developer = new CppDeveloper();
            }
            developers.put(specialty, developer);
        }

        return developer;
    }
}
