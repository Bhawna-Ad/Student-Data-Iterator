import java.util.Arrays;

public class Student {
    private int enroll_no;
    private Data data;

    public Student(int val, Data data) {
        this.enroll_no = val;
        this.data = data;
    }

    public void display() {
        System.out.println(this.enroll_no + " " + this.data.name + " " + this.data.age + " " + Arrays.toString(this.data.courses));
    }
}
