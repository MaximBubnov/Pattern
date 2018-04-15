package structual.facade;

//рабочий процесс (и есть наш фасад)
public class Workflow {

    Developer developer = new Developer();
    Job job = new Job();
    BackTracker backTracker = new BackTracker();

    public void solveProblems() {

        job.doJob();
        backTracker.startSprint();
        developer.doJobBeforeDeadline(backTracker);
    }
}
