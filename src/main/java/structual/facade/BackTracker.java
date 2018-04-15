package structual.facade;

public class BackTracker {

    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint() {
        System.out.println("Sprint is active");
        activeSprint = true;
    }

    public void fifnishSprint() {
        System.out.println("Sprint is not active");
        activeSprint = false;
    }
}
