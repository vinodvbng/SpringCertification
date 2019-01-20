package com.vinodv.initdestroy;

public interface CachingMovieLister {

    void populateMovieCache();
    void start();
    void clearMovieCache();

}
