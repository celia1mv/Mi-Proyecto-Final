package proyecto.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import proyecto.data.entity.UserEntity;
import proyecto.service.MenuService;

@Controller

public class IndexController extends AbstractController {

    @Autowired
    public IndexController(MenuService menuService) {
        super(menuService);
    }

    @GetMapping("/")
    public String indexPage(ModelMap model) {
        //final Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
       // model.addAttribute("username", ((UserEntity) principal).getUserName());
        return "index";
    }
}
