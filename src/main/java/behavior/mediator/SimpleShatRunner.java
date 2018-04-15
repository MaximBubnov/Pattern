package behavior.mediator;

public class SimpleShatRunner {

    public static void main(String[] args) {

        SimpleTextChat simpleTextChat = new SimpleTextChat();

        User admin = new Admin(simpleTextChat, "Admin");

        User user1 = new SimpleUser(simpleTextChat, "User1");
        User user2 = new SimpleUser(simpleTextChat, "User2");

        simpleTextChat.setAdmin(admin);
        simpleTextChat.addUserToChat(user1);
        simpleTextChat.addUserToChat(user2);

        user1.sendMessage("Hello. I am user 1");

        admin.sendMessage("Roger that. I am admin");


    }
}
