package com.example.israil.cinmatica.models.Cinemas;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class ResultCinema {

        @SerializedName("main")
        @Expose
        private List<Object> main;
        @SerializedName("unmain")
        @Expose
        private List<Unmain> unmain;

        public List<Object> getMain() {
            return main;
        }

        public void setMain(List<Object> main) {
            this.main = main;
        }

        public List<Unmain> getUnmain() {
            return unmain;
        }

        public void setUnmain(List<Unmain> unmain) {
            this.unmain = unmain;
        }

    }

