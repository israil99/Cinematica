package com.example.israil.cinmatica.models.Movies.Movies;




import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Main {
    @SerializedName("result")
    private List<Result> result;

    @SerializedName("count")
    private String count;

    @SerializedName("succes")
    private String succes;

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }


    public String getSucces() {
        return succes;
    }

    public void setSucces(String succes) {
        this.succes = succes;
    }

    @Override
    public String toString() {
        return "ClassPojo [result = " + result + ", count = " + count + ", succes = " + succes + "]";

    }
}