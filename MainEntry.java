package DesignPattern.Template;

import java.util.ArrayList;

public class MainEntry {
    public static void main(String[] args) {
        String title = "디자인패턴";
        ArrayList<String> content = new ArrayList<String>();
        content.add("디자인패턴 앗살라마이쿰");
        content.add("디자인패턴  외우기 진짜 싫어");
        content.add("어쩔티비");
        content.add("우짤래미");

        String footer = "2023.8.12 Developer 오지환";
        Article article = new Article(title, content, footer);

        System.out.println("Case - 1");
        DisplayArticleTemplate stlye1 = new SimpleDisplayArticle(article);
        stlye1.display();
        System.out.println();

        System.out.println("Case - 2");
        DisplayArticleTemplate stlye2 = new SimpleDisplayArticle(article);
        stlye2.display();


    }
}
