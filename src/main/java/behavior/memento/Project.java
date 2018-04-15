package behavior.memento;

import java.util.Date;
//сам проект
public class Project {

    private String version;
    private Date date;

    public void setVersionAndDate(String vesion) {
        this.version = vesion;
        this.date = new Date();

    }

    @Override
    public String toString() {
        return "Project{" +
                "\n Version : " + version +
                "\n Date : " + date +
                '}';
    }

    public Save save() {
        return new Save(version);
    }

    public void load(Save save) {
        version = save.getVersion();
        date = save.getDate();
    }
}

