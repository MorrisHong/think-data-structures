package kr.gracelove.think.datastructures.ListClient;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClientExampleMain {
    public static void main(String[] args) {
        ListClientExample lce = new ListClientExample();
        List list = lce.getList();
        System.out.println("list instanceof LinkedList ? : " + (list instanceof LinkedList));
        System.out.println("list instanceof ArrayList ? : " + (list instanceof ArrayList));
    }
}
