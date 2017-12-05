package model;

import java.util.ArrayList;
import java.util.List;

public class Names {

    List<String> names;

    public Names() {
        names = new ArrayList<>();
    }

    public List<String> getNames() {
        return names;
    }

    public void addNewNameToTheList(String name){
        names.add(name);
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "Names{" +
                "names=" + names +
                '}';
    }
}
