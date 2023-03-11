package Electricity.Billing.System;


import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///ebs", "root", "jaypal");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

