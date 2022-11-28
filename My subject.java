public class My subject
{

    public static void main(String[] args) {
        int subject1 = 50;
        int subject2 = 60;
        int subject3 = 70;
        int subject4 = 80;
        int subject5 = 90;
        int avg = (subject1 + subject2 + subject3 + subject4 + subject5) / 5;
        if (avg < 50) {
            System.out.printf("student is failed");
        } else if (avg > 50 && avg < 60) {
            System.out.printf("student is Got A");
        } else if (avg < 60 && avg < 80) {
            System.out.printf("student is Got O");
        } else if (avg < 80 && avg < 100) {
            System.out.printf("student is Got S");
        }
    }
}
