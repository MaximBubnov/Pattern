package pattern.creation.abstractfacory.banking;

import pattern.creation.abstractfacory.Developer;
import pattern.creation.abstractfacory.ProjectManager;
import pattern.creation.abstractfacory.ProjectTeamFactory;
import pattern.creation.abstractfacory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManger() {
        return new BankingPM();
    }
}
