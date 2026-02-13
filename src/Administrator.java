public class Administrator extends Person {
    private String position;        // должность
    private String officeNumber;

    public Administrator(String name, int id, String email,
                         String position, String officeNumber) {
        super(name, id, email);
        this.position = position;
        this.officeNumber = officeNumber;
    }

    // ПЕРЕОПРЕДЕЛИТЬ
    @Override
    public String getRole() {
        // TODO: вернуть "Администратор (" + position + ")"
        return "Administrator (" + this.position + ", " + this.officeNumber + ")";
    }

    // ПЕРЕОПРЕДЕЛИТЬ: администраторы имеют административный доступ
    @Override
    public String getAccessLevel() {
        // TODO: вернуть "Administrative"
        return "Admin";
    }


    @Override
    public void displayInfo() {
        // TODO: вызвать super.displayInfo()
        // TODO: вывести должность и номер кабинета
        super.displayInfo();
        System.out.println("Position: " + this.position);
        System.out.println("Office Number: " + this.officeNumber);
    }
}
