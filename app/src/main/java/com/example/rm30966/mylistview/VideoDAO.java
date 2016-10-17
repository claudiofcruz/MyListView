package com.example.rm30966.mylistview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RM30966 on 17/10/2016.
 */
public class VideoDAO {
    public static List<Video> listar()
    {
        List<Video> lista = new ArrayList<Video>();
        lista.add(new Video(1,"Roma", 50));
        lista.add(new Video(2,"Friends", 60));
        lista.add(new Video(3,"House Of Cards", 70));
        lista.add(new Video(4,"Game Of Trones", 80));

        return lista;
    }


}
