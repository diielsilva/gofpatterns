package creational.singleton;

import java.util.ArrayList;
import java.util.List;

class DatabaseConnection {
    private final List<Object> data;
    private static DatabaseConnection connection;

    private DatabaseConnection() {
        data = new ArrayList<>();
    }

    static DatabaseConnection getInstance() {
        if (connection == null) {
            connection = new DatabaseConnection();
        }

        return connection;
    }

    void save(Object data) {
        this.data.add(data);
    }

    List<Object> getData() {
        return List.copyOf(data);
    }

    Object delete(Object data) {
        return this.data.remove(data);
    }

}
