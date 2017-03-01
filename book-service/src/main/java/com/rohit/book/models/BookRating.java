package com.rohit.book.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * Created by rohitrajt on 2/24/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookRating implements Serializable {

    private String rank;

    private boolean isBestSeller;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public boolean isBestSeller() {
        return isBestSeller;
    }

    public void setBestSeller(boolean bestSeller) {
        isBestSeller = bestSeller;
    }
}
