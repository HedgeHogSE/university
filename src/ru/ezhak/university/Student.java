package ru.ezhak.university;

public final class Student extends Human{
    private final int studentIDNumber;

    public Student(String name, int studentIDNumber) {
        super(name);
        this.studentIDNumber = studentIDNumber;
    }

    @Override
    public boolean checkUser() {
        String tmpName = this.name == null ? "" : this.name;
        return (!tmpName.isBlank() && (studentIDNumber > 0 && studentIDNumber < 1_000_000_000));
    }

    public int getStudentIDNumber() {
        return studentIDNumber;
    }
}
