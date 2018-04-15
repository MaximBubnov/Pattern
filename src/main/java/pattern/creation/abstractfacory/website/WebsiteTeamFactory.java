package pattern.creation.abstractfacory.website;

import pattern.creation.abstractfacory.Developer;
import pattern.creation.abstractfacory.ProjectManager;
import pattern.creation.abstractfacory.ProjectTeamFactory;
import pattern.creation.abstractfacory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManger() {
        return new WebSitePM();
    }
}
