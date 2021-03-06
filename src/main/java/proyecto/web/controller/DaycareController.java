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
import proyecto.service.DaycareService;
import proyecto.service.MenuService;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
public class DaycareController extends AbstractController<DaycareDTO>{

    private final DaycareService service;
    @Autowired
    protected DaycareController(MenuService menuService, DaycareService servicio) {
        super(menuService);
        this.service = servicio;
    }
    @GetMapping("/daycare")
    @PreAuthorize("hasAuthority('ROLE_USER') or hasRole('ROLE_ADMIN')")
    public String getAll(@RequestParam("page") Optional<Integer> page, @RequestParam("size") Optional<Integer> size,
                         Model model) {
        //final User user = ((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        final Page<DaycareDTO> all = this.service.findAll( PageRequest.of(page.orElse(1) - 1,
                size.orElse(10)));
        model
                //.addAttribute("username", user.getUserName())
                .addAttribute("daycare", all)
                .addAttribute(pageNumbersAttributeKey, getPageNumbers(all));
        return "daycare/list";
    }

    @GetMapping("/daycare/{id}")
    @PostAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')")
    public String detail(@PathVariable("id") Integer id, ModelMap model) {
        model.addAttribute("daycare", this.service.findById(id).get());
        return "daycare/detail";
    }

    @GetMapping("/daycare/{id}/edit")
    @PostAuthorize("hasRole('ROLE_ADMIN') ")
    public String edit(@PathVariable("id") Integer id, ModelMap model) {
        model.addAttribute("daycare", this.service.findById(id).get());
        return "daycare/edit";
    }

    @GetMapping("/daycare/create")
    @PostAuthorize("hasRole('ROLE_ADMIN') ")
    public String create(ModelMap model) {
        final DaycareDTO dto = new DaycareDTO();
        model.addAttribute("daycare", dto);
        return "daycare/edit";
    }

    @Transactional
    @PostMapping(value = { "/daycare/{id}/edit", "/daycare/create" })
    @PostAuthorize("hasRole('ROLE_ADMIN') ")
    public String save(DaycareDTO dto) {
        return String.format("redirect:/daycare/%s", this.service.save(dto).getId());
    }

    @PostMapping({ "/daycare/{id}/delete" })
    public Object delete(@PathVariable(value = "id") Integer id, SessionStatus status) {
        try {
            this.service.delete(id);
        } catch (DataIntegrityViolationException exception) {
            status.setComplete();
            return new ModelAndView("error/errorHapus")
                    .addObject("entityId", id)
                    .addObject("entityName", "daycare")
                    .addObject("errorCause", exception.getRootCause().getMessage())
                    .addObject("backLink", "/daycare");
        }
        status.setComplete();
        return "redirect:/daycare";
    }
}
