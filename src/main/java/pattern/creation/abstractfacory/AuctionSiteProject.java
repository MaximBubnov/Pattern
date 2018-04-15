package pattern.creation.abstractfacory;

import pattern.creation.abstractfacory.website.WebsiteTeamFactory;

public class AuctionSiteProject {

    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManger();

        System.out.println("Auction Site is creating now : ");

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
