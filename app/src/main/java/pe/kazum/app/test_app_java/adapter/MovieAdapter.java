package pe.kazum.app.test_app_java.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import pe.kazum.app.test_app_java.R;
import pe.kazum.app.test_app_java.bean.MovieBean;

/**
 * Created by jonat on 5/2/2018.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder>{

    List<MovieBean> lstMovies;

    public MovieAdapter(List<MovieBean> lstMovies) {
        this.lstMovies = lstMovies;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView txtName, txtCreationDate, txtAuthorName;
        public ViewHolder(View v){
            super(v);
            txtName = (TextView) v.findViewById(R.id.nameMovie);
            txtCreationDate = (TextView) v.findViewById(R.id.creationDate);
            txtAuthorName = (TextView) v.findViewById(R.id.authorMovie);
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
    }

    @Override
    public int getItemCount() {
        return lstMovies.size();
    }



}
