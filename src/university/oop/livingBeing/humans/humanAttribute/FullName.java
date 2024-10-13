package university.oop.livingBeing.humans.humanAttribute;

public class FullName {
    private String surname;

    private String name;
    private String patronymic;

    public FullName(String surname, String name, String patronymic) throws Exception {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        if (this.notNameless()) throw new Exception("Surname, name or patronymic must not be empty");

    }

    public FullName(String surname, String name) throws Exception {
        this(surname, name, null);
    }

    public FullName(String name) throws Exception {
        this(null, name, null);
    }


    private boolean notNameless () {
        return (nullOrEmpty(this.name) && nullOrEmpty(this.surname) && nullOrEmpty(this.patronymic));
    }

    private static boolean nullOrEmpty (String arg) {
        return (arg == null || arg.isBlank());
    }

    public String toString() {
        String copySurname = (surname == null) ? "" : surname;
        String copyName = (name == null) ? "" : name;
        String copyPatronymic = (patronymic == null) ? "" : patronymic;
        return (copySurname + " " + copyName + " " + copyPatronymic).trim();
    }
}
