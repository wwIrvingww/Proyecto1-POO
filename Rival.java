import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rival here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rival extends Actor
{
    /**
     * Act - do whatever the Rival wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        mover();
        Eat();
    }
       
    public void mover()
    //Funcion que genera movimiento aleatorio para el rival
    {
        move(6);
        if (Greenfoot.getRandomNumber(100)<10)
        {
            turn(Greenfoot.getRandomNumber(40)-20);
        }
        if (isAtEdge())
        {
            turn(Greenfoot.getRandomNumber(80)-40);
        }
    }

       public void Eat()
        //Funcion que hace que si el rival toca la order, 
        //desaparezca
       {
        if (isTouching(order.class)){
            removeTouching(order.class); 
        }
    }
}
