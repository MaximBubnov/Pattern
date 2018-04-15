package pattern.creation.abstractfacory.banking;

import pattern.creation.abstractfacory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java dev writes Java Code... ");
    }
}
