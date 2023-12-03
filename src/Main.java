public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
       User user1 = new User(1, "Nik");
       User user2 = new User(1, "Nik");
       User user3 = new User(3, "Jon");

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);

        System.out.println(user1.equals(user2));
        System.out.println(user1.equals(user3));

        User clonedUser = user1.clone("deep");

        System.out.println(clonedUser);
    }
}