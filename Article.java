package DesignPattern.Template;

import java.util.ArrayList;

public class Article {
    private String Title;
    private ArrayList<String> content;
    private String footer;

    public Article(String title, ArrayList<String> content, String footer) {
        Title = title;
        this.content = content;
        this.footer = footer;
    }

    public String getTitle() {
        return Title;
    }

    public ArrayList<String> getContent() {
        return content;
    }

    public String getFooter() {
        return this.footer;
    }
}
