package JDBC;

import java.util.List;

public class TestArticle {
    public static void main(String[] args) {
        DaoArticle daoArticle = new DaoArticle();
        daoArticle.Delete("ART3");
        System.out.println(" Nbre d'article est : "+daoArticle.Count());
//        JDBC.Article article = JDBC.Article.builder()
//                .code("ART3")
//                .designation("ARTICLE 3")
//                .prix(289)
//                .build();
//        daoArticle.Create(article);
/*        List<Article> articles = daoArticle.All();
        articles.forEach(art -> System.out.println(art));
        Article article = Article.builder()
                .designation("CLAVIER")
                .prix(290)
                .build();
        daoArticle.Update(article,"ART3");
    articles = daoArticle.All();
        articles.forEach(art -> System.out.println(art));*/

//        Optional<JDBC.Article> article = daoArticle.Read("ART10");
//
//        article.ifPresentOrElse(
//                art ->  System.out.println(art) ,
//                ()-> System.out.println("ARTICLE NOT FOUND !!!")
//                );
    }
}
    /*JDBC.Article article = daoArticle.Read("ART1");
       if(article==null)
               System.err.println("not found");
               else
               System.out.println(article);*/