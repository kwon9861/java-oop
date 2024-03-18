import java.lang.reflect.Constructor;

public class Train {
    private String company;
    private String grade;

    public Train(){}
    public Train(String company, String grade) {
        this.company = company;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Train{" +
                "company='" + company + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Train train = new Train("로템", "SRT");
        System.out.println(train);
    }
}
