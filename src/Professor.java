public class Professor extends Person {
    private String department;      // кафедра
    private String[] courses;       // преподаваемые курсы
    private int courseCount;
    private int yearsOfExperience;

    public Professor(String name, int id, String email,
                     String department, int yearsOfExperience) {
        super(name, id, email);
        this.department = department;
        this.courseCount = 0;
        this.courses = new String[10];
        this.yearsOfExperience = yearsOfExperience;



        // TODO: вызвать конструктор родителя
        // TODO: инициализировать courses = new String[10]
        // TODO: courseCount = 0
        // TODO: инициализировать department и yearsOfExperience
    }

    // Добавляет курс
    public void addCourse(String courseName) {
        if(this.courseCount < this.courses.length) {
            courses[this.courseCount] = courseName;
            courseCount++;
        }else{
            System.out.println("Course already exists");

        }
        // TODO: если courseCount < 10, добавить курс и увеличить счетчик
    }

    // ПЕРЕОПРЕДЕЛИТЬ: роль профессора
    @Override
    public String getRole() {
        if(yearsOfExperience > 10) {
            return "Professor старший";
        }else return "Professor";
        // TODO: если yearsOfExperience > 10, вернуть "Профессор (старший)"
        // TODO: иначе вернуть "Профессор"

    }

    // ПЕРЕОПРЕДЕЛИТЬ: профессора имеют полный доступ
    @Override
    public String getAccessLevel() {
        // TODO: вернуть "Full"
        return "Full";
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(department + yearsOfExperience + courseCount);
        // TODO: вызвать super.displayInfo()
        // TODO: вывести кафедру, опыт, количество курсов
    }

    public String getDepartment() { return department; }
    public int getCourseCount() { return courseCount; }
    int getYearsOfExperience() {
        return  yearsOfExperience;
    }
}
