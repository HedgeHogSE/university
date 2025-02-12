package ru.ezhak.statement;

public class HRDepartment extends Department {
    private boolean hasVacancy = true;

    @Override
    public boolean process(Statement statement) {
        if (!hasVacancy) {
            statement.status = false;
            return false;
        }
        nextDepartment = new AccountingDepartment();
        statement.signatures.add("Отдел кадров");
        return true;
    }
}
