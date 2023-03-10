package com.ctacekscompany.cinemateque.data;

public class FilmInfo {
    private String name;

    private int posterImage;

    public FilmInfo(String name, int pic){

        this.name=name;
        this.posterImage=pic;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getPictureResource() {
        return this.posterImage;
    }

    public void setPictureResource(int pictureResource) {
        this.posterImage = pictureResource;
    }
}
