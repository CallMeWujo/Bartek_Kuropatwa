public class Grades {

    private int[] grades;

    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int getLastAddedGrade() {
        return this.grades[this.size - 1];
    }

    public double getAverage() {
        double sum = 0.0;
        int gradesAmount = this.size;
        for (int i = 0; i < this.size; i++) {
            sum =sum + grades[i];
        }
        double averageGradeAmount = sum / gradesAmount;
        return averageGradeAmount;
    }

}
