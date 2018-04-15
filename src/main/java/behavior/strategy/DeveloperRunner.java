package behavior.strategy;

public class DeveloperRunner {

    public static void main(String[] args) {

        Developer developer = new Developer();

        developer.setActivity(new Sleeping());
        developer.executeActivity();

        developer.setActivity(new Training());
        developer.executeActivity();

        developer.setActivity(new Coding());
        developer.executeActivity();

        developer.setActivity(new Reading());
        developer.executeActivity();

        developer.setActivity(new Sleeping());
        developer.executeActivity();

        //похож на состояние, но там мы меняли активности в самом девелопере, а не в клиентском коде
    }
}
