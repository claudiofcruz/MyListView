package com.example.rm30966.mylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    private ListView listaVideos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listaVideos = (ListView) findViewById(R.id.listVideos);

        List<Video> lista = VideoDAO.listar();

        //O segundo parametro é uma view padrão do android
        ListAdapter adapter = new ArrayAdapter<Video>(this, android.R.layout.simple_list_item_1, lista);
        listaVideos.setAdapter(adapter);
    }
}
