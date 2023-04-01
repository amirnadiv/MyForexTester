package com.amirnadiv.myforextester.utils;

import java.nio.file.Path;
import java.sql.*;

public class H2CSVLoader {

    public void importDataIntoTable() throws ClassNotFoundException, SQLException {

        Connection conn = null;
        Statement stmt = null;

        Class.forName("org.h2.Driver");
        conn = DriverManager.getConnection("jdbc:h2:mem:Test", "sa", "");
        conn.setAutoCommit(true);
        stmt = conn.createStatement();

        stmt.execute("drop table if exists GBPJPY");
        stmt.execute("CREATE TABLE IF NOT EXISTS GBPJPY (\n" +
                "                         id   INTEGER      NOT NULL AUTO_INCREMENT,\n" +
                "                         date VARCHAR(128) NOT NULL,\n" +
                "                         time  VARCHAR(128) ,\n" +
                "                         high  DOUBLE ,\n" +
                "                         low   DOUBLE ,\n" +
                "                         open  DOUBLE ,\n" +
                "                         close DOUBLE ,\n" +
                "                         volume int ,\n" +
                "                         PRIMARY KEY (id)\n" +
                ")");
        stmt.execute("insert into GBPJPY ( date,time,high,low,open,close,volume ) " +
                "select  \"date\",  \"time\", \"high\", \"low\", \"open\", \"close\",\"volume\"  " +
                " from CSVREAD( 'C:\\JAVA_PROJECTS\\MyForexTester\\src\\main\\resources\\data\\GBPJPY_2023_01.csv', 'date,time,high,low,open,close,volume', null ) " +
                "commit ;" );

//        ResultSet rs = stmt.executeQuery("select * from GBPJPY");
//
//        while (rs.next()) {
//            System.out.println("id " + rs.getInt("id") + " date " + rs.getString("date") + " time " + rs.getString("time"));
//        }

        conn.commit();
        stmt.close();
        conn.close();
    }
}
