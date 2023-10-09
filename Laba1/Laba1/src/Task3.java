import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

public class Task3 {
    public static void main(String[] args) {
        Set<User> set = new HashSet<>();

        set.add(new User("Max", 12));
        set.add(new User("Max", 12));
        set.add(new User("Max", 12));
        set.add(new User("Max", 12));

        if (set.size() == 1) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }
    }

    static class User {

        String name;
        int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return age == user.age && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }

}
