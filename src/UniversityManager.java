import java.util.Arrays;

public class UniversityManager {

    // ПОЛИМОРФИЗМ: работает с любыми Person
    public static void displayAllPeople(Person[] people) {
        for (Person p : people) {
            p.displayInfo();
            System.out.println("-----");
        }
        // TODO: для каждого человека вызвать displayInfo()
        // TODO: вывести разделитель "---"
    }

    // Подсчитывает статистику по уровням доступа
    public static void printAccessStatistics(Person[] people) {
        int countFull = 0;
        int countBasic = 0;
        int countAdmin = 0;
        int countStudent = 0;
        int countExtended= 0;

        for (Person p : people) {

            if (p.getAccessLevel().equals("Student")) {
                countStudent++;
            } else if (p.getAccessLevel().equals("Admin")) {
                countAdmin++;
            } else if (p.getAccessLevel().equals("Full")){
                countFull++;
            } else if(p.getAccessLevel().equals("Extended")) {
                countExtended++;
            }
            else
                countBasic++;}
        System.out.println("Basic: " + countBasic);
        System.out.println("Student: " + countStudent);
        System.out.println("Admin: " + countAdmin);
        System.out.println("Full: " + countFull);
        System.out.println("Extended: " + countExtended);
    }




    // TODO: создать счетчики для каждого уровня доступа
    // TODO: пройти по массиву, получить getAccessLevel() для каждого
    // TODO: увеличить соответствующий счетчик
    // TODO: вывести результаты


    // Находит всех студентов-отличников
    public static Student[] findHonorStudents(Person[] people) {
        // TODO: первый проход - посчитать количество отличников
        //       использовать instanceof для проверки типа
        //       использовать приведение типа (Student) для доступа к isHonorStudent()
        // TODO: создать массив Student[] нужного размера
        // TODO: второй проход - заполнить массив
        int count = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i] instanceof Student) {
                Student student = (Student)people[i];
                if (student.isHonorStudent()) {
                    count++;
                }
            }

        }
        Student[] students = new Student[count];

        for (int i = 0; i < count; i++) {
            if (people[i] instanceof Student) {
                Student student = (Student)people[i];
                if (student.isHonorStudent()) {
                    students[i] = student;
                }
            }
        }
        return students;
    }

    // Находит всех профессоров определенной кафедры
    public static Professor[] findProfessorsByDepartment(Person[] people,
                                                         String department) {
        // TODO: аналогично предыдущему методу
        // TODO: использовать instanceof Professor
        // TODO: проверить getDepartment().equals(department)
        int count = 0;
        for(int i = 0; i < people.length; i++) {
            if (people[i] instanceof Professor) {
                Professor prof = (Professor)people[i];
                if (prof.getDepartment().equals(department)) {
                    count++;
                }
            }
        }
        Professor[] professors = new Professor[count];

        for (int i = 0; i < professors.length; i++ ) {
            if (people[i] instanceof Professor) {
                Professor prof = (Professor)people[i];
                if (prof.getDepartment().equals(department)) {
                    professors[i] = prof;
                }
            }
        }

        return professors;
    }

    // Выводит всех людей с определенной ролью
    public static void printByRole(Person[] people, String roleKeyword) {
        for (Person p : people) {
            String role = p.getRole();
            if (role.contains(roleKeyword)) {
                System.out.println(p.getName() + "." +role);
            }
            // TODO: для каждого человека получить getRole()
            // TODO: если роль содержит roleKeyword (используйте .contains())
            // TODO: вывести имя и полную роль
        }
    }
    // Считает средний балл всех студентов университета
    static double calculateUniversityAverage(Person[] people) {
        double sum = 0;
        int cont = 0;

        // TODO: найти всех студентов (instanceof)
        // TODO: просуммировать их средние баллы
        // TODO: разделить на количество студентов
        for (Person p : people) {
            if (p instanceof Student) {
                Student student = (Student) p;
                sum += student.getAverage();
                cont++;
                ;
            }
        }
        if (cont > 0){
            return 0;
        }
        return sum / cont;
    }
}
