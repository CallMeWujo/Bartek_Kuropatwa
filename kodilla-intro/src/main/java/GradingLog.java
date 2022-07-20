public class GradingLog {
    public static void main(String[] args) {
        Grades gradingLog = new Grades();
        gradingLog.add(1);
        gradingLog.add(2);
        gradingLog.add(3);
        gradingLog.add(3);
        gradingLog.add(4);
        gradingLog.add(5);
        gradingLog.add(1);
        gradingLog.add(5);
        gradingLog.add(1);
        gradingLog.add(3);
        System.out.println(gradingLog.getLastAddedGrade());
        System.out.println(gradingLog.getAverage());

    }
}
