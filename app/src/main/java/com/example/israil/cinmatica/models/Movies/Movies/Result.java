package com.example.israil.cinmatica.models.Movies.Movies;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {
    @SerializedName("s_on")
    private String s_on;
    @SerializedName("comments_count")
    private String comments_count;
    @SerializedName("sessions")
    private List<Sessions> sessions;
    @SerializedName("premier_ua")
    private String premier_ua;
    @SerializedName("ad_on")
    private String ad_on;
    @SerializedName("vote")
    private String vote;
    @SerializedName("is3d")
    private String is3d;
    @SerializedName("image")
    private String image;
    @SerializedName("is_b")
    private String is_b;
    @SerializedName("imdb")
    private String imdb;
    @SerializedName("b_link")
    private String b_link;
    @SerializedName("countries")
    private String countries;
    @SerializedName("rejisser")
    private String rejisser;
    @SerializedName("url")
    private String url;
    @SerializedName("age_limit")
    private String age_limit;
    @SerializedName("id")
    private String id;
    @SerializedName("trailers_count")
    private String trailers_count;
    @SerializedName("photos_count")
    private String photos_count;
    @SerializedName("name")
    private String name;
    @SerializedName("reviews_count")
    private String reviews_count;
    @SerializedName("count_vote")
    private String count_vote;
    @SerializedName("actors")
    private String actors;

    public String getS_on() {
        return s_on;
    }

    public void setS_on(String s_on) {
        this.s_on = s_on;
    }

    public String getComments_count() {
        return comments_count;
    }

    public void setComments_count(String comments_count) {
        this.comments_count = comments_count;
    }

    public List<Sessions> getSessions() {
        return sessions;
    }

    public void setSessions(List<Sessions> sessions) {
        this.sessions = sessions;
    }

    public String getPremier_ua() {
        return premier_ua;
    }

    public void setPremier_ua(String premier_ua) {
        this.premier_ua = premier_ua;
    }

    public String getAd_on() {
        return ad_on;
    }

    public void setAd_on(String ad_on) {
        this.ad_on = ad_on;
    }

    public String getVote() {
        return vote;
    }

    public void setVote(String vote) {
        this.vote = vote;
    }

    public String getIs3d() {
        return is3d;
    }

    public void setIs3d(String is3d) {
        this.is3d = is3d;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getIs_b() {
        return is_b;
    }

    public void setIs_b(String is_b) {
        this.is_b = is_b;
    }

    public String getImdb() {
        return imdb;
    }

    public void setImdb(String imdb) {
        this.imdb = imdb;
    }

    public String getB_link() {
        return b_link;
    }

    public void setB_link(String b_link) {
        this.b_link = b_link;
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    public String getRejisser() {
        return rejisser;
    }

    public void setRejisser(String rejisser) {
        this.rejisser = rejisser;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAge_limit() {
        return age_limit;
    }

    public void setAge_limit(String age_limit) {
        this.age_limit = age_limit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTrailers_count() {
        return trailers_count;
    }

    public void setTrailers_count(String trailers_count) {
        this.trailers_count = trailers_count;
    }

    public String getPhotos_count() {
        return photos_count;
    }

    public void setPhotos_count(String photos_count) {
        this.photos_count = photos_count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReviews_count() {
        return reviews_count;
    }

    public void setReviews_count(String reviews_count) {
        this.reviews_count = reviews_count;
    }

    public String getCount_vote() {
        return count_vote;
    }

    public void setCount_vote(String count_vote) {
        this.count_vote = count_vote;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "ClassPojo [s_on = " + s_on + ", comments_count = " + comments_count + ", sessions = " + sessions + ", premier_ua = " + premier_ua + ", ad_on = " + ad_on + ", vote = " + vote + ", is3d = " + is3d + ", image = " + image + ", is_b = " + is_b + ", imdb = " + imdb + ", b_link = " + b_link + ", countries = " + countries + ", rejisser = " + rejisser + ", url = " + url + ", age_limit = " + age_limit + ", id = " + id + ", trailers_count = " + trailers_count + ", photos_count = " + photos_count + ", name = " + name + ", reviews_count = " + reviews_count + ", count_vote = " + count_vote + ", actors = " + actors + "]";
    }
}