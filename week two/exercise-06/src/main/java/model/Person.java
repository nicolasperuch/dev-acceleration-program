package model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String name;
    private Date birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM");
        df.setLenient(false);
        try {
            this.birthDate = df.parse(birthDate);
        } catch (ParseException e) {
            // se cair aqui, a data é inválida
            System.err.println("Data inválida");
        }
    }
}
