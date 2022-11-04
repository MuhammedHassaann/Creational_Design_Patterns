package com.moyaga.creationalDesignPatterns.Prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {
    public static void main(String[] args) {
/*        String sql="SELECT * FROM movies WHERE title = ?";
        List<String> parameters= new ArrayList<String>();
        Record record;

        parameters.add("Star Wars");
        record=new Record();

        Statement statement=new Statement(sql,parameters,record);

        System.out.println(statement.getSql());
        System.out.println(statement.getParameters());
        System.out.println(statement.getRecord());

        Statement secondStatement= statement.clone();

        System.out.println(secondStatement.getSql());
        System.out.println(secondStatement.getParameters());
        System.out.println(secondStatement.getRecord());*/

        Registry registry=new Registry();
        Movie movie=(Movie) registry.createItem("Movie");
        movie.setTitle("Lord Of The Rings");
        System.out.println(movie);
        System.out.println(movie.getTitle());
        System.out.println(movie.getPrice());
        System.out.println(movie.getRunTime());
        System.out.println(movie.getUrl());

        Movie anotherMovie=(Movie) registry.createItem("Movie");
        anotherMovie.setTitle("Gang Of Four");
        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getRunTime());
        System.out.println(anotherMovie.getUrl());

    }
}
