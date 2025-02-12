package ru.ezhak.statement;

import java.util.ArrayList;
import java.util.List;

public class SecurityDepartment extends Department {
    private List<String> list = new ArrayList<>(List.of("Илюшка"));

    @Override
    public boolean process(Statement statement) {
        if (list.contains(statement.name)) {
            statement.status = false;
            return false;
        }
        nextDepartment = new HRDepartment();
        statement.signatures.add("Безопасность");
        return true;
    }


}
