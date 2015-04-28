/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.util.Random;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Spencer
 */
public class Tests {
    public static void main(String[] args) {
       
        
    }
    
    public static String game (Friend one,Friend two)
    {
        while (one.health > 0 && two.health > 0)
        {
        attack(one,two);
        attack(two,one);
        }
        return one.health > two.health ? "P1":"P2";
    }
    public static void attack(Friend one, Friend two)
    {
        
        Random randy = new Random();
        two.health=two.health-randy.nextInt(100);
    }
}
