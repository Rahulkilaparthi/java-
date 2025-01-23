public class gr_4942 {
    public static void main(String[] args) {

        if (args.length != 5) {
            System.out.println("Please provide marks for all five subjects.");
            return;
        }

        double physics = Double.parseDouble(args[0]);
        double chemistry = Double.parseDouble(args[1]);
        double biology = Double.parseDouble(args[2]);
        double mathematics = Double.parseDouble(args[3]);
        double computer = Double.parseDouble(args[4]);
        double totalMarks = physics + chemistry + biology + mathematics + computer;
        double percentage = (totalMarks / 500) * 100;
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("Total Marks: " + totalMarks + "/500");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
