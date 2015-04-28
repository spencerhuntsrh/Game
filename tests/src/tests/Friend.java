/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

/**
 *
 * @author Spencer
 */
public class Friend {
    public Friend(double health,double attack,boolean shield,boolean gay)
    {
        setHealth(health);
        setAttack(attack);
        setShield(shield);
        setOrientation(gay);
    }
    
    public boolean orientation;
    public boolean shield;
    public double health;
    public double attack;
    
    public void setHealth(double health)
    {
        this.health = health;
    }
    public void setAttack(double attack)
    {
        this.attack = attack;
    }
    public void setShield(boolean shield)
    {
        this.shield = shield;
    }
    public void setOrientation(boolean gay)
    {
        this.orientation = gay;
    }
}
