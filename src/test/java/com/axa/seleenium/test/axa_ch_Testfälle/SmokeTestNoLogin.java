package com.axa.seleenium.test.axa_ch_Testfälle;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTestNoLogin {


  @Test(groups = {"smokeTests"})
  public void kollisionTest(){
    Assert.assertEquals(true, false);
  }
}

