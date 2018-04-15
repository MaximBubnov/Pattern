package behavior.observer;

import java.util.List;

//наблюдатель
public class Subscriber implements Observer{

    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancy) {
        System.out.println("Dear " + name + "\n We have some changes in vacancies: \n " + vacancy + "\n=====================================\n ");
    }
}
