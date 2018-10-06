package com.example.israil.cinmatica.models.Movies.newMovies;

import java.util.List;

public class Movies
{
    private List<NewResult> result;

    private String count;

    private String succes;

    public List<NewResult> getResult ()
    {
        return result;
    }

    public void setResult (List<NewResult> result)
    {
        this.result = result;
    }

    public String getCount ()
    {
        return count;
    }

    public void setCount (String count)
    {
        this.count = count;
    }

    public String getSucces ()
    {
        return succes;
    }

    public void setSucces (String succes)
    {
        this.succes = succes;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [result = "+result+", count = "+count+", succes = "+succes+"]";
    }
}