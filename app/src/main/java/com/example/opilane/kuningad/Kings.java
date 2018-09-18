package com.example.opilane.kuningad;


import java.util.ArrayList;
import java.util.List;

public class Kings {
    private List<King> list=new ArrayList();
    public Kings(){
        for (String [] arr : data)
            list.add(new King(arr[0], Integer.parseInt(arr[1]),Integer.parseInt(arr[2])));

    }
    public List<King> getKings(){
        return list;
    }
    private static final String [] [] data = {
            {"Henry VII", "1509", "1547"},
            {"Edward", "1547", "1553"},
            {"Mary I", "1553", "1558"},
            {"Elisabeth I", "1558", "1603"},
            {"James I", "1603", "1625"},
            {"Charles I", "1625", "1649"}
    };
}
