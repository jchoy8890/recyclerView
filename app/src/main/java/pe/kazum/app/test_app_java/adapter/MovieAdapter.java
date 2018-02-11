package pe.kazum.app.test_app_java.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import pe.kazum.app.test_app_java.R;
import pe.kazum.app.test_app_java.adapter.event.ClickEvent;
import pe.kazum.app.test_app_java.bean.MovieBean;

/**
 * Created by jonat on 5/2/2018.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> implements RecyclerView.OnClickListener{

    private List<MovieBean> lstMovies;
    private ClickEvent clickEvent;

    public MovieAdapter(List<MovieBean> lstMovies) {
        this.lstMovies = lstMovies;
    }

    @Override
    public void onClick(View v) {

    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView txtName, txtCreationDate, txtAuthorName;
        public ImageView imgView;
        public ViewHolder(View v){
            super(v);
            txtName = (TextView) v.findViewById(R.id.nameMovie);
            txtCreationDate = (TextView) v.findViewById(R.id.creationDate);
            txtAuthorName = (TextView) v.findViewById(R.id.authorMovie);
            imgView = (ImageView) v.findViewById(R.id.imgMovie);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_movie_list_row, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        MovieBean movie = lstMovies.get(position);
        holder.txtName.setText(movie.getNameMovie());
        holder.txtAuthorName.setText(movie.getAuthorMovie());
        holder.txtCreationDate.setText(String.valueOf(movie.getCreationDate()));
        //Glide.with(this).load("http://goo.gl/gEgYUd").into(imgView);
    }

    @Override
    public int getItemCount() {
        return lstMovies.size();
    }



}
