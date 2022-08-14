import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Deliver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deliver extends Actor
{
    ciudad thisGame;
    /**
     * Act - do whatever the Deliver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {   
        Move();
        Eat();
        
    }
    
    //Funcion para que el personaje se mueva en base a la flecha que apache el 
    //usuario.
    public void Move(){
        if (Greenfoot.isKeyDown("right")){
            setLocation(getX()+4,getY());     
        }
        
        if (Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()+4);
        }
        
        if (Greenfoot.isKeyDown("left")){
            setLocation(getX()-4,getY());
        }
        
        if (Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-4);
        }
    }
    
    //Función para que las ordenes desaparezcan cuando el delivery las toca
    public void Eat(){
        if (isTouching(order.class)){
            removeTouching(order.class); 
            thisGame.score++;
        }
    }       
}

