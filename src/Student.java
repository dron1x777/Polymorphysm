public class Student extends Person {
    private double[] grades;
    private int gradeCount;
    private String major;        // специальность
    private int year;            // курс (1-4)

    public Student(String name, int id, String email, String major, int year) {
        super(name, id, email);

        this.grades = new double[20];
        this.gradeCount = 0;

        this.major = major;
        this.year = year;
    }

    // Добавляет оценку в массив
    public void addGrade(double grade) {
        if (gradeCount < 20) {
            grades[gradeCount] = grade;
            gradeCount++;
        } else {
            System.out.println("Массив оценок полон");
        }
    }


    // Считает средний балл
    public double getAverage() {
        if (gradeCount == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < gradeCount; i++) {
            sum += grades[i];
        }
        return sum / gradeCount;
    }

    // ПЕРЕОПРЕДЕЛИТЬ: роль студента
    @Override
    public String getRole() {
        return "Student " + year + " course";
    }

    // ПЕРЕОПРЕДЕЛИТЬ: студенты 3-4 курса имеют Extended доступ
    @Override
    public String getAccessLevel() {
        if (year > 3) {
            return "Extended";
        }else {
            return "Student";
        }

    }

    // ПЕРЕОПРЕДЕЛИТЬ: добавить информацию о специальности и среднем балле
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Специальность: " + major);
        System.out.println("Курс: " + year);
        System.out.println("Средний балл: " + getAverage());

    }

    // Отличник ли студент (средний балл >= 90)
    public boolean isHonorStudent() {
        return getAverage() >= 90;
    }
    public String getMajor()
    { return major; }

    public int getYear()
    { return year; }
}
