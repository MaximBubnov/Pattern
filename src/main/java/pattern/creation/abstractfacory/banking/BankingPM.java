package pattern.creation.abstractfacory.banking;

import pattern.creation.abstractfacory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Project Manager manages banking project");
    }
}
