package structual.adapter;

public class DatabaseRunner {

    public static void main(String[] args) {

        Database database = new AdaperJavaToDatabase();

        database.insert();
        database.update();
        database.remove();
        database.select();
    }
}
