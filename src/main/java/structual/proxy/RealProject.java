package structual.proxy;

public class RealProject implements Project {

    private String url;


    public void load() {
        System.out.println("Project is loading from " + url);
    }

    public RealProject(String url) {
        this.url = url;
        load();
    }

    @Override
    public void run() {
        System.out.println("running project " + url + "....");
    }
}
