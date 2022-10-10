package oit.is.z0365.kaizi.janken.model;

import java.util.ArrayList;

public class Janken {
  ArrayList<String> numList = new ArrayList<>();

  public String judg(String jan) {
    String result;

    if (jan == "Gu") {
      result = "Win!";
    } else if (jan == "Tyoki") {
      result = "Drow";
    } else if (jan == "Pa") {
      result = "Lost";
    } else {
      result = null;
    }

    return result;
  }

  public ArrayList<String> getNumList() {
    return numList;
  }

  public void setNumList(ArrayList<String> numList) {
    this.numList = numList;
  }

}
