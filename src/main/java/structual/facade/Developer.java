package structual.facade;

public class Developer {

    public void doJobBeforeDeadline(BackTracker backTracker) {

        if(backTracker.isActiveSprint()) {
            System.out.println("Developer is solving problem");
        } else {
            System.out.println("Developer is reading Habrhabr");
        }
    }
}
