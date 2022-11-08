package th.ac.ku.cakeRunnerWeb.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.cakeRunnerWeb.model.Cakes;
import th.ac.ku.cakeRunnerWeb.service.CakesService;
import th.ac.ku.cakeRunnerWeb.service.UserService;

import java.util.UUID;

@Controller
@RequestMapping("/cakes")
public class CakesController {

    @Autowired
    private CakesService cakesService;
    @Autowired
    private UserService userServices;


    @GetMapping("/edit/{id}")
    public String getEditForm(@PathVariable UUID id, Model model) {
        Cakes cakes = cakesService.getOneById(id);
        model.addAttribute("cakes", cakes);
        return "cakes-edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Cakes cakes, Model model) {
        if(checkCake(cakes.getWeight(), cakes.getPrice(), cakes.getAmount())){
            cakesService.update(cakes);
        }
        return "redirect:/cakes";
    }

    @GetMapping
    public String getCakes(Model model, Authentication authentication)
    {
        userServices.setLoginUser(authentication.getName());
        model.addAttribute("cakes", cakesService.getAll());
        return "cakes";
    }
    @GetMapping("/add")
    public String getAddForm(){
        // return rings-add.html
        return "cakes-add";
    }

    @PostMapping("/add")
    public String addCakes(@ModelAttribute Cakes cakes, Model model) {
        // พอรับเข้ามาจะเอาเข้า List
        if(checkCake(cakes.getWeight(), cakes.getPrice(), cakes.getAmount())){
            cakesService.addCakes(cakes);
        }
        return "redirect:/cakes";
    }

    public boolean checkCake(int weight, int price, int amount){
        if(weight > 0 && price > 0 && amount > 0){
            return true;
        }
        return false;
    }



}
