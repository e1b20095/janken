package oit.is.z0365.kaizi.janken;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;

@SpringBootApplication
public class JankenApplication {
  ArrayList<String> numList = new ArrayList<>();
  String name;

  public static void main(String[] args) {
    SpringApplication.run(JankenApplication.class, args);
  }

  public String judg(int jan) {

    if (jan == 0) {
      return "Drow";
    } else if (jan == 2) {
      return "Lost";
    } else {
      return "Win!";
    }

  }

  public ArrayList<String> getNumList() {
    return numList;
  }

  public void setNumList(ArrayList<String> numList) {
    this.numList = numList;
  }

  public String getname() {
    return name;
  }

  public void setname(String name) {
    this.name = name;
  }

}
