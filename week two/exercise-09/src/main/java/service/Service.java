package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Service {

    private Stack stack;
    private List<String> list;

    public Service() {
        this.stack = new Stack();
        this.list = new ArrayList<>();
    }


    public void populateList(){
        list.add("one");
        list.add("two");
        list.add("three");
    }

    public void showList(){
        System.out.println("List: "+ list);
    }

    public void devoter(){
        while ( !list.isEmpty() ) {
            System.out.println("Sairam da fila: " + list.remove(0));
        }
    }

    private boolean isObjectEmpty(List object){
        return object.size() == 0;
    }
}
