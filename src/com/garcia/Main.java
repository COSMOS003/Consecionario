package com.garcia;

import com.garcia.util.ConectorBD;

import java.sql.Connection;

public class Main {
    public static void main(String[] arg){
        Connection connection = ConectorBD.getConnection();

    }
}
