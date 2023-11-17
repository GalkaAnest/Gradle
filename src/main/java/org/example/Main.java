package org.example;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException  {
        GUser user = new GUser( " Galyna ", " Gaponova ");

        ObjectMapper om = new ObjectMapper();
        System.out.println("JSON ==> " +om.writeValueAsString(user));
    }
}