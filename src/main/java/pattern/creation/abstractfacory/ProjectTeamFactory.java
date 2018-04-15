package pattern.creation.abstractfacory;



public interface ProjectTeamFactory {

    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManger();

}
