package oit.is.z0365.kaizi.janken.controller;

import java.security.Principal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/janken")
public class JankenController {

  @GetMapping("step1")
  public String start() {
    return "janken.html";
  }

  @GetMapping("step2")
  public String login(ModelMap model, Principal prin) {
    String loginUser = prin.getName(); // ログインユーザ情報
    model.addAttribute("login_user", loginUser);
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
