package pe.kazum.app.test_app_java.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

import pe.kazum.app.test_app_java.R;
import pe.kazum.app.test_app_java.bean.MovieBean;

/**
 * Created by jonat on 5/2/2018.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    public interface OnItemClickListener {
        void onItemClick(MovieBean movieBean);
    }

    private List<MovieBean> lstMovies;
    private OnItemClickListener onItemClickListener;
    private Context ctx;

    public MovieAdapter(Context ctx, List<MovieBean> lstMovies, OnItemClickListener onItemClickListener) {
        this.lstMovies = lstMovies;
        this.onItemClickListener = onItemClickListener;
        this.ctx = ctx;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ctx)
                .inflate(R.layout.activity_movie_list_row, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(lstMovies.get(position), onItemClickListener);
    }

    @Override
    public int getItemCount() {
        return lstMovies.size();
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

        public void bind(final MovieBean movieBean, final OnItemClickListener onItemClickListener){

            txtName.setText(movieBean.getNameMovie());
            txtAuthorName.setText(movieBean.getAuthorMovie());
            txtCreationDate.setText(String.valueOf(movieBean.getCreationDate()));
            Glide.with(ctx).load("http://via.placeholder.com/100.png").into(imgView);
            imgView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Toast.makeText(ctx, movieBean.getNameMovie(), Toast.LENGTH_LONG).show();
                }
            });





        }

    }


}
