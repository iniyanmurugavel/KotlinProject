package kt.innerclass;

interface Hero1 {
    void saveCity();
}

public class AnonymousInnerClass {

    public static  void main(String args[]) {
        Hero1 spidy = new Hero1() {
            @Override
            public void saveCity() {
            System.out.println("Spidy Saving City...");
            }
        };

        spidy.saveCity();
    }
}
