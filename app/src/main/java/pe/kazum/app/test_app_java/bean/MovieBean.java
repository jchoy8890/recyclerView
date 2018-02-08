package pe.kazum.app.test_app_java.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by jonat on 5/2/2018.
 */

public class MovieBean implements Serializable{

    private int idMovie;
    private String nameMovie;
    private Date creationDate;
    private String authorMovie;
    private String image;

    public MovieBean(String nameMovie, Date creationDate, String authorMovie, String image){
        this.nameMovie = nameMovie;
        this.creationDate = creationDate;
        this.authorMovie = authorMovie;
        this.setImage(image);
    }

    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getAuthorMovie() {
        return authorMovie;
    }

    public void setAuthorMovie(String authorMovie) {
        this.authorMovie = authorMovie;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
