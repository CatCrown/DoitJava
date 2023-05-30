package chapter06.lessonP190;

public class Student3 {
    private static int serialNum = 1000;
    private int studentId;
    private String studentName;
    private int grade;
    private String address;
    private int cardNumber;

    public Student3() {
        serialNum++;
        studentId = serialNum;
        cardNumber = studentId + 100;
        System.out.println("학생의 학번은 "+ studentId +"이고 카드 번호는 " + cardNumber + "입니다.");
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student3.serialNum = serialNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
