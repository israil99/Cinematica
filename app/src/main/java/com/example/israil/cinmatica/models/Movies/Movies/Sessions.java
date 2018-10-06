package com.example.israil.cinmatica.models.Movies.Movies;

import com.google.gson.annotations.SerializedName;


public class Sessions
{
    @SerializedName("k_t3")
    private String k_t3;
    @SerializedName("sessions")
    private String sessions;
    @SerializedName("k_t0")
    private String k_t0;
    @SerializedName("k_bron")
    private String k_bron;
    @SerializedName("k_id")
    private String k_id;
    @SerializedName("k_addr")
    private String k_addr;
    @SerializedName("k_type")
    private String k_type;
    @SerializedName("k_url")
    private String k_url;
    @SerializedName("k_adv")
    private String k_adv;
    @SerializedName("h_is3d")
    private String h_is3d;
    @SerializedName("k_to")
    private String k_to;
    @SerializedName("h_mplex")
    private String h_mplex;
    @SerializedName("k_name")
    private String k_name;
    @SerializedName("h_name")
    private String h_name;

    public String getK_t3 ()
    {
        return k_t3;
    }

    public void setK_t3 (String k_t3)
    {
        this.k_t3 = k_t3;
    }

    public String getSessions ()
    {
        return sessions;
    }

    public void setSessions (String sessions)
    {
        this.sessions = sessions;
    }

    public String getK_t0 ()
    {
        return k_t0;
    }

    public void setK_t0 (String k_t0)
    {
        this.k_t0 = k_t0;
    }

    public String getK_bron ()
    {
        return k_bron;
    }

    public void setK_bron (String k_bron)
    {
        this.k_bron = k_bron;
    }

    public String getK_id ()
    {
        return k_id;
    }

    public void setK_id (String k_id)
    {
        this.k_id = k_id;
    }

    public String getK_addr ()
    {
        return k_addr;
    }

    public void setK_addr (String k_addr)
    {
        this.k_addr = k_addr;
    }

    public String getK_type ()
    {
        return k_type;
    }

    public void setK_type (String k_type)
    {
        this.k_type = k_type;
    }

    public String getK_url ()
    {
        return k_url;
    }

    public void setK_url (String k_url)
    {
        this.k_url = k_url;
    }

    public String getK_adv ()
    {
        return k_adv;
    }

    public void setK_adv (String k_adv)
    {
        this.k_adv = k_adv;
    }

    public String getH_is3d ()
    {
        return h_is3d;
    }

    public void setH_is3d (String h_is3d)
    {
        this.h_is3d = h_is3d;
    }

    public String getK_to ()
    {
        return k_to;
    }

    public void setK_to (String k_to)
    {
        this.k_to = k_to;
    }



    public String getH_mplex ()
    {
        return h_mplex;
    }

    public void setH_mplex (String h_mplex)
    {
        this.h_mplex = h_mplex;
    }

    public String getK_name ()
    {
        return k_name;
    }

    public void setK_name (String k_name)
    {
        this.k_name = k_name;
    }

    public String getH_name ()
    {
        return h_name;
    }

    public void setH_name (String h_name)
    {
        this.h_name = h_name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [k_t3 = "+k_t3+", sessions = "+sessions+", k_t0 = "+k_t0+", k_bron = "+k_bron+", k_id = "+k_id+", k_addr = "+k_addr+", k_type = "+k_type+", k_url = "+k_url+", k_adv = "+k_adv+", h_is3d = "+h_is3d+", k_to = "+k_to+", h_mplex = "+h_mplex+", k_name = "+k_name+", h_name = "+h_name+"]";
    }
}