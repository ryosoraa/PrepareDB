package com.preparedb.kadaijin.asset;

import java.util.Random;

public class AgeAndPhone {

  public Integer age() {

    Integer min = 10;
    Integer max = 99;

    Integer age = (int) (Math.random() * (max - min + 1) + min);
    return age;
  }

  public Integer phone() {

    Random random = new Random();
    Integer phone = random.nextInt(9999999);

    return phone;
  }

}
