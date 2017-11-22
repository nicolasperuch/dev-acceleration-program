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

    public void invertList(){

        putListintoStack();
        putStackintoList();
    }

    private void putListintoStack(){
        while(!isObjectEmpty(list)) {
            stack.push(list.get(0));
            list.remove(0);
        }
    }

    private void putStackintoList() {
        while (!isObjectEmpty(stack)) {
            list.add((String) stack.lastElement());
            stack.pop();
        }
    }

    private boolean isObjectEmpty(List object){
        return object.size() == 0;
    }
}
