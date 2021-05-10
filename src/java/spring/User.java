package java.spring;

public class User implements Comparable<User> {

    public User(){
    }
    public String name;
    public int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding the compareTo method
    @Override
    public int compareTo(User d) {
        return (this.name).compareTo(d.name);
    }
}
