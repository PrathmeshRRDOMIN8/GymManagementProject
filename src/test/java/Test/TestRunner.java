/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Test;

import javax.naming.spi.DirStateFactory.Result;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

/**
 *
 * @author prtme
 */
public class TestRunner {
    
    public static void main(String[] args) {
        org.junit.runner.Result result = JUnitCore.runClasses(JUnitTest.class);
      for (Failure failure : result.getFailures()) {
         System.out.println("fail reason : "+failure.toString());
      }
      System.out.println("passed:"+result.wasSuccessful());
      System.out.println("failures :"+result.getFailures());
   }
}