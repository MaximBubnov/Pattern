package pattern.creation.abstractfacory.website;

import pattern.creation.abstractfacory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes code...");
    }
}
