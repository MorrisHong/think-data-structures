package kr.gracelove.think.datastructures.ListClient;

import java.util.LinkedList;
import java.util.List;

public class ListClientExample {
    private List list;

    public ListClientExample(){
        this.list = new LinkedList();
    }

    public List getList() {
        return list;
    }
}
