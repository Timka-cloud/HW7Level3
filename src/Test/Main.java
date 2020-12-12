package Test;

public class Main {
    public static void main(String[] args) {
        TestingClass testing = new TestingClass();
        TestHandler.start(testing.getClass());
    }
}
