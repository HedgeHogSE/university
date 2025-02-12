package ru.ezhak.dataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataBase {
    private final int maxUsers;
    private final List<Connection> connections = new ArrayList<>();
    private List<String> data = new ArrayList<>();

    public DataBase(int maxUsers) {
        this.maxUsers = maxUsers;
        this.data = generateRandomData(10);
    }

    private List<String> generateRandomData(int count) {
        List<String> randomData = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            randomData.add("Record " + random.nextInt(1000));
        }
        return randomData;
    }

    public Connection getConnection () {
        if (connections.size() < maxUsers) {
            Connection connection = new Connection(this);
            connections.add(connection);
            return connection;
        }
        return null;
    }

    String getData (int index) {
        if (index < data.size() && index >= 0) {
            return data.get(index);
        }
        return null;
    }

    void addData (String value) {
        this.data.add(value);
    }

}
