package pe.kazum.app.test_app_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import pe.kazum.app.test_app_java.adapter.MovieAdapter;
import pe.kazum.app.test_app_java.bean.MovieBean;

public class ListaDatos extends AppCompatActivity {

    private List<MovieBean> lstMovies = new ArrayList<MovieBean>();
    private RecyclerView recyclerView;
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_datos);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewMovies);

        movieAdapter = new MovieAdapter(lstMovies);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(movieAdapter);
        populateList();
    }

    private void populateList() {
        MovieBean movieBean = new MovieBean("Star Wars 1",new Date(),"Steven Spielberg","");
        lstMovies.add(movieBean);
        movieBean = new MovieBean("Star Wars 2",new Date(),"Steven Spielberg","");
        lstMovies.add(movieBean);
        movieBean = new MovieBean("Star Wars 3",new Date(),"Steven Spielberg","");
        lstMovies.add(movieBean);
        movieBean = new MovieBean("Star Wars 4",new Date(),"Steven Spielberg","");
        lstMovies.add(movieBean);
        movieBean = new MovieBean("Star Wars 5",new Date(),"Steven Spielberg","");
        lstMovies.add(movieBean);
        movieBean = new MovieBean("Star Wars 6",new Date(),"Steven Spielberg","");
        lstMovies.add(movieBean);
        movieBean = new MovieBean("Star Wars 7",new Date(),"Steven Spielberg","");
        lstMovies.add(movieBean);
        movieBean = new MovieBean("Star Wars 8",new Date(),"Steven Spielberg","");
        lstMovies.add(movieBean);

        movieAdapter.notifyDataSetChanged();
    }
}
