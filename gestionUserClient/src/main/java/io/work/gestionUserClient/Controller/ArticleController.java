package io.work.gestionUserClient.Controller;

import io.work.gestionUserClient.entity.Article;
import io.work.gestionUserClient.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins= "*")
@RequestMapping("/api/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @GetMapping
    public List<Article> getAllArticle(){

        return articleService.getAllArticle();
    }

    @PostMapping
    public Article saveArticle(@RequestBody Article article){
        return articleService.saveArticle(article);
    }

    @PostMapping("modifier")
    public Article updateArticle(@RequestBody Article article){
        return articleService.updateArticle(article);
    }

    @DeleteMapping("/{id}")
    public void deleteArticle(@PathVariable Long id){
        articleService.deleteArticle(id);
    }
}





