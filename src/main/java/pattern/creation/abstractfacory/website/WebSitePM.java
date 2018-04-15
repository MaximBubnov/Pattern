package pattern.creation.abstractfacory.website;

import pattern.creation.abstractfacory.ProjectManager;

public class WebSitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Web Site PM manages website project...");
    }
}
