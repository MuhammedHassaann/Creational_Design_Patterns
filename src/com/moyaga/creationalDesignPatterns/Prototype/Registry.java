package com.moyaga.creationalDesignPatterns.Prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String,Item> items = new HashMap<String, Item>();

    public Registry(){
        loudItem();
    }

    public Item createItem(String type){
        Item item=null;
        try {
            item=(Item) items.get(type).clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return item;
    }

    private void loudItem(){
        Movie movie=new Movie();
        movie.setTitle("Basic Movie");
        movie.setRunTime("2 Hours");
        movie.setPrice(29.99);
        items.put("Movie",movie);

        Book book=new Book();
        book.setTitle("Basic Book");
        book.setPrice(11.99);
        book.setNumberOfPages(356);
        items.put("Book",book);
    }
}
