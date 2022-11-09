package Tests.src;

import java.util.*;

public class Test1 {

    // Refactor this method to make it more clear
    public List <User> findTopUsers(List <User> users) {
        users.removeIf(User::hasNoSubscriptions);

        HashMap <Integer, List <User>> map = new HashMap <>();
        for (User u : users) {
            if (!map.containsKey(u.getSubscriptions().size())) {
                map.put(u.getSubscriptions().size(), new LinkedList <>());
            }
            map.get(u.getSubscriptions().size()).add(u);
        }

        System.out.println("Top users has " + Collections.max(map.keySet()) + " subscriptions: ");
        for (User u : map.get(Collections.max(map.keySet()))) {
            System.out.println("User ID: " + u.getId() + ", name: " + u.getName());
        }
        return map.get(Collections.max(map.keySet()));
    }

    public static void main(String[] args) {

        List <User> listOfUsers = createUsers();

        Test1 test1 = new Test1();
        test1.findTopUsers(listOfUsers);


    }

    public static List createUsers() {
        List <String> listSubs = new ArrayList <>();
        listSubs.add("Apple Music");
        listSubs.add("Google Play Music");
        listSubs.add("Spotify");
        listSubs.add("IVI");
        listSubs.add("Apple+");
        listSubs.add("YouTube Premium");
        listSubs.add("TikTok premium");
        listSubs.add("Apple Arcade");
        listSubs.add("NETFLIX");
        listSubs.add("Amazon Prime");
        listSubs.add("Marvel Unlimited");
        listSubs.add("XBOX LIVE");
        listSubs.add("PLAYSTATION PLUS");

        User user1 = new User(2, "Petro", listSubs.subList(2, 3));
        User user2 = new User(3, "Volodimir", listSubs.subList(0, 6));
        User user3 = new User(4, "Kirill", listSubs.subList(0, 6));
        User user4 = new User(1, "Victor", listSubs.subList(0, 3));
        User user5 = new User(5, "Arthur", listSubs.subList(3, 5));
        User user6 = new User(6, "Nikolai", Collections.EMPTY_LIST);
        User user7 = new User(7, "Stepan", listSubs.subList(0, 3));
        User user8 = new User(8, "Olya", listSubs.subList(2, 3));
        User user9 = new User(9, "Vasiliy", listSubs.subList(0, 6));
        User user10 = new User(10, "Zhenya", listSubs.subList(0, 6));
        User user11 = new User(11, "Tanya", listSubs.subList(3, 5));
        User user12 = new User(12, "Valentin", Collections.EMPTY_LIST);

        List <User> listOfUsers = new ArrayList <>();

        listOfUsers.add(user1);
        listOfUsers.add(user2);
        listOfUsers.add(user3);
        listOfUsers.add(user4);
        listOfUsers.add(user5);
        listOfUsers.add(user6);
        listOfUsers.add(user7);
        listOfUsers.add(user8);
        listOfUsers.add(user9);
        listOfUsers.add(user10);
        listOfUsers.add(user11);
        listOfUsers.add(user12);

        return listOfUsers;
    }


}

class User <T> {
    private final int id;
    private final T name;
    private final List <String> subscriptions;

    public User(int id, T name, List <String> subscriptions) {
        this.id = id;
        this.name = name;
        this.subscriptions = subscriptions;
    }

    int getId() {
        return id;
    }

    T getName() {
        return name;
    }

    List <String> getSubscriptions() {
        return subscriptions;
    }

    boolean hasNoSubscriptions() {
        return subscriptions.size() == 0;
    }

}



