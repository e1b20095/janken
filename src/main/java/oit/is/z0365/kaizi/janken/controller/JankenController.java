package oit.is.z0365.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.engine.AttributeName;

@Controller
public class JankenController {
  @GetMapping("/sample")
  public String sample() {
    return "janken.html";
  }

  @PostMapping("/janken")
  public String janken(@RequestParam String name, ModelMap model) {
    model.addAttribute("name", name);
    return "janken.html";
  }

  @GetMapping("/game")
  public String game(@RequestParam String hand, ModelMap model) {
    String myhand = hand;
    String cpuhand = "Gu";
    String kekka;

    if (hand == "Gu") {
      kekka = "Drow";
    } else if (hand == "Choki") {
      kekka = "Lost";
    } else {
      kekka = "Win";
    }

    model.addAttribute("myhand", myhand);
    model.addAttribute("cpuhand", cpuhand);
    model.addAttribute("kekka", kekka);
    return "janken.html";
  }

}
