package behavior.observer;

import java.util.ArrayList;
import java.util.List;

//наблюдаемый обьект
public class JavaDeveloperJobSite implements Observed {

    List<String> vacancies = new ArrayList<>();

    //спиок наблюдателей
    List<Observer> subscribers = new ArrayList<>();

    public void addVacancy(String vacancy) {
        this.vacancies.add(vacancy);
        notifyObserveres();
    }

    public void removeVacancy(String vacancy) {
        this.vacancies.remove(vacancy);
        notifyObserveres();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObserveres() {
        for(Observer o : subscribers) {
            o.handleEvent(this.vacancies);
        }
    }
}
