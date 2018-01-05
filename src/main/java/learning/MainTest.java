package learning;

public class MainTest {
    public static void main(String args[]) {
        TestLomHok testLomHok = new TestLomHok("1", "sun", "20");
        System.out.println(testLomHok.getId() + "," + testLomHok.getName() + "," + testLomHok.getAge());
    }
}
