import model.Subject;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.setName("Mathematics");
        subject.setWorkload(10);

        System.out.println(subject.getName());
        System.out.println(subject.getWorkload());
    }
}
