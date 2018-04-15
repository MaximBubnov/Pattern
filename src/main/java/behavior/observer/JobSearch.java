package behavior.observer;

public class JobSearch {

    public static void main(String[] args) {

        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java position");
        jobSite.addVacancy("Second Java position");

        Observer firstSubscribers = new Subscriber("Maxim Bubnov");
        Observer secondSubscribers = new Subscriber("Peter Ivanov");

        jobSite.addObserver(firstSubscribers);
        jobSite.addObserver(secondSubscribers);

        //пока не добавим это ничего не изменится
        //т.к только при изменении обьектов
        jobSite.addVacancy("Third Java position");

        jobSite.removeVacancy("First Java position");
    }
}
