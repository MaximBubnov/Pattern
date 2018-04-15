package structual.proxy;

public class ProjectRunner {

    public static void main(String[] args) {

        //ленивая сылка на обьект
        Project project = new ProxyProject(" https://www.github.com/MaximBubnov/javaForm");

        //запуск обьекта
        project.run();
    }
}
