package pattern.creation.abstractfacory.website;

import pattern.creation.abstractfacory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website code...");
    }
}
