package com.runners;

import org.openqa.selenium.By;

import com.charan.Base;
import com.pageObjects.Facebook;
import com.pageObjects.Gmail;

public class RunWithMainMethod extends Base {
   static Facebook f = new Facebook();
    static Gmail g = new Gmail();
    public static void main(String[] args) {
       launchBrowser();
       maximize();
      f.login("charan", "password");
}
}