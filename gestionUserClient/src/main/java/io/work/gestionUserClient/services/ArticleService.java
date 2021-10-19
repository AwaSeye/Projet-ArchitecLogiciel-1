package io.work.gestionUserClient.services;

import io.work.gestionUserClient.entity.Article;

import java.util.List;

public interface ArticleService {
    public List<Article> getAllArticle();
    public Article saveArticle(Article article);
    public Article updateArticle(Article article);
    public  void deleteArticle(Long id);
}
