package clone;

public class CloneTest {
    public static void main(String[] args) {
        Person p1 = new Person("Amy",23,new Car("benz",300));
        try {
            Person p2 = MyUtil.clone(p1);
            p2.getCar().setBrand("BYD");
            System.out.println(p1);
            System.out.println(p2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
