package proyecto.web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import proyecto.dto.DaycareDTO;
import proyecto.dto.DogWalkerDTO;
import proyecto.service.DaycareService;
import proyecto.service.DogwalkerService;
import proyecto.service.MenuService;

import java.util.Optional;


@Controller
public class DogwalkerController extends AbstractController<DogWalkerDTO>{

    private final DogwalkerService service;
    @Autowired
    protected DogwalkerController(MenuService menuService, DogwalkerService servicio) {
        super(menuService);
        this.service = servicio;
    }
    @GetMapping("/dogWalker")
    @PreAuthorize("hasAuthority('ROLE_USER') or hasRole('ROLE_ADMIN')")
    public String getAll(@RequestParam("page") Optional<Integer> page, @RequestParam("size") Optional<Integer> size,
                         Model model) {
        //final User user = ((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        final Page<DogWalkerDTO> all = this.service.findAll( PageRequest.of(page.orElse(1) - 1,
                size.orElse(10)));
        model
                //.addAttribute("username", user.getUserName())
                .addAttribute("dogWalker", all)
                .addAttribute(pageNumbersAttributeKey, getPageNumbers(all));
        return "dogWalker/list";
    }

    @GetMapping("/dogWalker/{id}")
    @PostAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')")
    public String detail(@PathVariable("id") Integer id, ModelMap model) {
        model.addAttribute("dogWalker", this.service.findById(id).get());
        return "dogWalker/detail";
    }

    @GetMapping("/dogWalker/{id}/edit")
    @PostAuthorize("hasRole('ROLE_ADMIN') ")
    public String edit(@PathVariable("id") Integer id, ModelMap model) {
        model.addAttribute("dogWalker", this.service.findById(id).get());
        return "dogWalker/edit";
    }

    @GetMapping("/dogWalker/create")
    @PostAuthorize("hasRole('ROLE_ADMIN') ")
    public String create(ModelMap model) {
        final DaycareDTO dto = new DaycareDTO();
        model.addAttribute("dogWalker", dto);
        return "dogWalker/edit";
    }

    @Transactional
    @PostMapping(value = { "/dogWalker/{id}/edit", "/dogWalker/create" })
    @PostAuthorize("hasRole('ROLE_ADMIN') ")
    public String save(DogWalkerDTO dto) {
        return String.format("redirect:/dogWalker/%s", this.service.save(dto).getId());
    }

    @PostMapping({ "/dogWalker/{id}/delete" })
    public Object delete(@PathVariable(value = "id") Integer id, SessionStatus status) {
        try {
            this.service.delete(id);
        } catch (DataIntegrityViolationException exception) {
            status.setComplete();
            return new ModelAndView("error/errorHapus")
                    .addObject("entityId", id)
                    .addObject("entityName", "dogWalker")
                    .addObject("errorCause", exception.getRootCause().getMessage())
                    .addObject("backLink", "/dogWalker");
        }
        status.setComplete();
        return "redirect:/dogWalker";
    }
}
