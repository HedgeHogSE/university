package ru.ezhak.dataBase;

public class Connection {
    private DataBase dataBase;

    Connection(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public String getData(int index) {
        return dataBase.getData(index);
    }

    public void addData(String value) {
        dataBase.addData(value);
    }
}
