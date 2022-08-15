import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Deliver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deliver extends Actor
{
    ciudad thisGame; //Se llama a la clase "ciudad" para usar uno de sus atributos 
    /**
     * Act - do whatever the Deliver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {   
        Move();
        Eat();
    }
    
    public void Move()
    //Funcion para que el personaje se mueva en base a la flecha que apache el 
    //usuario.
    {   
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
      
    public void Eat()
    //Función para que las ordenes desaparezcan cuando el delivery las toca.
    //También incrementa el contador "score" cada vez que este toca una orden
    {
        if (isTouching(order.class)){
            removeTouching(order.class); 
            thisGame.score++;
        }
    }       
}

