/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Test;

import com.mycompany.gymsdtfisac2.Coaches;
import com.mycompany.gymsdtfisac2.Login;
import com.mycompany.gymsdtfisac2.Members;
import com.mycompany.gymsdtfisac2.Payements;
import com.mycompany.gymsdtfisac2.Signup;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

/**
 *
 * @author prtme
 */
public class JUnitTest {
    public JUnitTest() {
    }
    @Test

     public void TestPayment(){
        Payements pay = new Payements();
        String [] li = {"1000","Prathmesh","1000"};
        Assert.assertArrayEquals(li, pay.returntest("1000",
                "Prathmesh","1000"));
    }
}   
    
//    
//    
//public void TestCoaches(){
//        Coaches coach = new Coaches();
//        String [] li = {"Prakash","9818295840","50","Delhi","Male","Trainer"};
//        Assert.assertArrayEquals(li, coach.returntest("Prakash","9818295840","50","Delhi","Male","Trainer"));
//    }
////    public void TestMembers(){
//       Members mem = new Members();
//       String [] li = {"Prathmesh","7903646350","20","2700","6AM-8AM","Ansh","Male","Normal"};
//       Assert.assertArrayEquals(li, mem.returntest("Prathmesh","7903646350","20","2700","6AM-8AM","Ansh","Male","Normal"));
//    }
//   
//        public void TestSignup(){
//        Signup signup = new Signup();
//        String [] li = {"Admin","1234"};
//        Assert.assertArrayEquals(li,signup.returntest("Admin", "1234"));
//    }
//
//public void TestLogin(){
//      Login login = new Login();
//      String [] li = {"Admin","1234"};
//      Assert.assertArrayEquals(li,login.returntest("Admin", "1234"));
//    }

