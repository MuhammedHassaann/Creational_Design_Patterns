package com.moyaga.creationalDesignPatterns.Factory;

public class Blog extends Website{
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
        pages.add(new AboutPage());
    }
}
