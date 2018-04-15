package structual.decorator;

public class Task {

    public static void main(String[] args) {

        Developer devepoer = new JavaTeamLead(new JavaDeveloper());

        System.out.println(devepoer.makeJob());

    }
}
