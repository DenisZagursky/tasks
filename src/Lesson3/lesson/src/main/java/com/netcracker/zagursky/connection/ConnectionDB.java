package com.netcracker.zagursky.connection;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionDB {

    private final String PATH_TO_BD_CONFIG = "src/main/resources/config.properties";

    private ConnectionDB() {
    }

    public Connection getConnection() {
        FileInputStream fileInputStream;
        Properties properties=new Properties();
        Connection connection = null;
        try {
            fileInputStream=new FileInputStream(PATH_TO_BD_CONFIG);
            properties.load(fileInputStream);
            Class.forName(properties.getProperty("db.driver"));
            connection = DriverManager.getConnection(
                    properties.getProperty("db.host"),
                    properties.getProperty("db.login"),
                    properties.getProperty("db.password"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }


    private static class Holder {
        private final static ConnectionDB INSTANCE = new ConnectionDB();
    }


    public static ConnectionDB getInstance() {
        return Holder.INSTANCE;
    }
}
