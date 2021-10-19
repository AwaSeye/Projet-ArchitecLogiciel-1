package io.work.gestionUserClient.services.Impl;

import io.work.gestionUserClient.entity.Article;
import io.work.gestionUserClient.exceptions.ResourceNotFoundException;
import io.work.gestionUserClient.repositories.ArticleRepository;
import io.work.gestionUserClient.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public List<Article> getAllArticle() {
        return articleRepository.findAll();
    }

    @Override
    public Article saveArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public Article updateArticle(Article article) {
        return articleRepository.findById(article.getId())
                .map(article1 -> {
                    return articleRepository.saveAndFlush(article);
                })
                .orElseThrow(()-> new ResourceNotFoundException("Cet article n'existe pas"));
    }

    @Override
    public void deleteArticle(Long id) {

        articleRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Cet article n'existe pas"));
        articleRepository.deleteById(id);
    }
}
