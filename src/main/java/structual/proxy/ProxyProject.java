package structual.proxy;

// это и есть наш прокси
//т.е мы с помощью него делаем ленивую ссылку на обьект

public class ProxyProject  implements  Project{

    private String url;
    private RealProject realProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if(realProject == null) {
            realProject = new RealProject(url);
        }

        realProject.run();
    }
}
