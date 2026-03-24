package learnjava.record;

public record Student(String id, String name, double gpa) {

    public boolean isScholarshipEligible() {
        return gpa > 3.2;
    }
    public Student {
        if(gpa < 0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA không thể âm và không thể lớn hơn 4.0");
        }
        if (name == null) {
            name = "Unknown"; // giá trị mặc định
        }
    }
}
