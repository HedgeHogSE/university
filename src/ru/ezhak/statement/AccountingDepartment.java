package ru.ezhak.statement;

public class AccountingDepartment extends Department {
    @Override
    boolean process(Statement statement) {
        if (!statement.signatures.contains("Отдел кадров")) {
            nextDepartment = new HRDepartment();
            return true;
        }
        if (!Character.isUpperCase(statement.text.charAt(0))) {
            statement.status = false;
            return false;
        } else {
            statement.signatures.add("Бухгалтерия");
            statement.status = true;
            return true;
        }
    }
}
