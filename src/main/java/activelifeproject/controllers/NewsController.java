package activelifeproject.controllers;

import activelifeproject.models.News;
import activelifeproject.repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class NewsController {

    @Autowired
    private NewsRepository newsRepository;

    @GetMapping("/news")
    public String showNews(@ModelAttribute("model") ModelMap modelMap) {
        List<News> news = newsRepository.findAll();
        modelMap.addAttribute("news", news);
        return "news";
    }

    @PostMapping("/addnews")
    public String addNews(@ModelAttribute News news) {
        newsRepository.save(news);
        return "redirect:/news";
    }

}
