import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
// 1. Создайте массив Person[] university = new Person[30]

        // 2. Заполните массив:
        //    - 15 студентов (разные курсы, специальности)
        //    - 10 профессоров (разные кафедры, опыт)
        //    - 5 администраторов (разные должности)
        Person[] persons = {
                new Student("student1", 123, "jnlekr@gmail.com", "tech", 3),
                new Student("student2", 123, "uygrniecor@gmail.com", "tech", 2),
                new Student("student3", 123, "jh5utvno3@gmail.com", "tech", 4),
                new Student("student4", 123, "ji54obvl@gmail.com", "tech", 2),
                new Student("student5", 123, "j7ihrpkr@gmail.com", "tech", 4),
                new Student("student6", 123, "jirvmjr@gmail.com", "tech", 1),
                new Student("student7", 123, "biorw@gmail.com", "tech", 3),
                new Student("student8", 123, "7,mlku@gmail.com", "tech", 4),
                new Student("student9", 123, "3un;@gmail.com", "tech", 1),
                new Student("student10", 123, "uy,lkytr@gmail.com", "tech", 3),
                new Student("student11", 123, "u.lk.,r@gmail.com", "tech", 2),
                new Student("student12", 123, "njyr b@gmail.com", "tech", 4),
                new Student("student13", 123, "mujmnmurb@gmail.com", "tech", 3),
                new Student("student14", 123, "u75nji7@gmail.com", "tech", 1),
                new Student("student15", 123, "mii@gmail.com", "tech", 2),
                new Professor("professor1", 1234, "vewbjchk@gmail.com", "business", 10),
                new Professor("professor2", 1234, "btnvelm@gmail.com", "informatica", 25),
                new Professor("professor3", 1234, "8gojir@gmail.com", "business", 12),
                new Professor("professor4", 1234, ".mnyn;ym@gmail.com", "business", 14),
                new Professor("professor5", 1234, "t,htomhop@gmail.com", "business", 4),
                new Professor("professor6", 1234, "kjfbher@gmail.com", "business", 364),
                new Professor("professor7", 1234, " btrkjbnrt@gmail.com", "informatica", 56),
                new Professor("professor8", 1234, "tnbtuihn@gmail.com", "business", 34),
                new Professor("professor9", 1234, "ervmongoue@gmail.com", "business", 2),
                new Professor("professor10", 1234, "mbklbntio@gmail.com", "informatica", 4),
                new Administrator("admin1", 12345, "vbwcrwve@gmail.com", "ehbfurfb", "something"),
                new Administrator("admin2", 12345, "tbv rb@gmail.com", "ehbfurfb", "something"),
                new Administrator("admin3", 12345, "tybrb@gmail.com", "ehbfurfb", "something"),
                new Administrator("admin4", 12345, "o,ytkuyu@gmail.com", "ehbfurfb", "something"),
                new Administrator("admin5", 12345, "iufng@gmail.com", "ehbfurfb", "something"),

        };

        // 3. Добавьте каждому студенту 5-8 оценок
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] instanceof Student) {
                ((Student) persons[i]).addGrade(rand.nextDouble(21, 99));
            }
        }

        // 4. Добавьте каждому профессору 2-3 курса
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] instanceof Professor) {
                ((Professor) persons[i]).addCourse("Biology");
                ((Professor) persons[i]).addCourse("Mathematics");
                ((Professor) persons[i]).addCourse("Chemistry");
            }

            // 5. Выведите информацию обо всех людях
            UniversityManager.displayAllPeople(persons);
            // 6. Выведите статистику по уровням доступа
            UniversityManager.printAccessStatistics(persons);
            // 7. Найдите всех отличников
            UniversityManager.findHonorStudents(persons);
            // 8. Найдите всех профессоров кафедры "Информатика"
            UniversityManager.findProfessorsByDepartment(persons, "informatica");
            // 9. Выведите всех людей с ролью содержащей "Профессор"
            UniversityManager.printByRole(persons, "Professor");
            // 10. Посчитайте средний балл по университету
            UniversityManager.calculateUniversityAverage(persons);
            // 11. Создайте метод, который найдет самого опытного профессора
            getMoreExperensiveProfessors(persons);
            // 12. Создайте метод, который подсчитает количество людей каждого типа
            getPersonsByRole(persons);
        }
    }

    public static void getMoreExperensiveProfessors(Person[] people) {
        int max = 0;
        String name = "";
        for (int i = 0; i < people.length; i++) {
            if (people[i] instanceof Professor) {
                if (((Professor) people[i]).getYearsOfExperience() > max) {
                    max = ((Professor) people[i]).getYearsOfExperience();
                    name = ((Professor) people[i]).getName();
                }
            }
        }
        System.out.println("max: " + max + " name: " + name);
    }


    public static void getPersonsByRole(Person[] people) {
        int countProfessor = 0;
        int countStudent = 0;
        int countAdmin = 0;
        int countPerson = 0;

        for (int i = 0; i < people.length; i++) {
            if (people[i] instanceof Professor) {
                countProfessor++;
            } else if (people[i] instanceof Student) {
                countStudent++;
            } else if (people[i] instanceof Administrator) {
                countAdmin++;
            } else if (people[i] instanceof Person) {
                countPerson++;
            }

        }
        System.out.println("professors: " + countProfessor + " students: " + countStudent +  " admins: " + countAdmin + " persons: " + countPerson);
    }
}
