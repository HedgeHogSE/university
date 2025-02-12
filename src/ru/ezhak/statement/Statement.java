package ru.ezhak.statement;

import java.util.ArrayList;
import java.util.List;

public class Statement {
    public String name;
    public String text;
    public List<String> signatures = new ArrayList<>();
    public boolean status;

    public Statement(String name, String text) {
        this.name = name;
        this.text = text;
    }
}
