package com.example.israil.cinmatica.models.Cinemas;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Cinemas {

    @SerializedName("succes")
    @Expose
    private Boolean succes;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("result")
    @Expose
    private ResultCinema result;

    public Boolean getSucces() {
        return succes;
    }

    public void setSucces(Boolean succes) {
        this.succes = succes;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ResultCinema getResult() {
        return result;
    }

    public void setResult(ResultCinema result) {
        this.result = result;
    }

}

