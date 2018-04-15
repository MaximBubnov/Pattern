package pattern.creation.abstractfacory;

import pattern.creation.abstractfacory.banking.BankingTeamFactory;

public class SuperBankSystem {

    public static void main(String[] args) {
        ProjectTeamFactory factory = new BankingTeamFactory();
        Developer developer = factory.getDeveloper();
        Tester tester = factory.getTester();
        ProjectManager projectManager = factory.getProjectManger();

        System.out.println("Creating bank system:  ");

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
