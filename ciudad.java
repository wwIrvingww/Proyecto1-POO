import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ciudad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ciudad extends World
{
    public static int score = 0;
    private int timer = 1000;
    /**
     * Constructor for objects of class ciudad.
     * 
     */
    public ciudad()
    {    
        //Crea el mundo 
        super(900, 700, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    //Agrega las orders iniciales, los rivales y al protagonista
    {
        order order = new order();
        addObject(order,151,399);
        order order1 = new order();
        addObject(order1, 500,399);
        order order2 = new order();
        addObject(order2,899,233);
        order order3 = new order();
        addObject(order3,600,600);
        Deliver deliver = new Deliver();
        addObject(deliver, 10,250);
        Rival rival = new Rival();
        addObject(rival,Greenfoot.getRandomNumber(700)-0,Greenfoot.getRandomNumber(700)-0);
        Rival rival1 = new Rival();
        addObject(rival,Greenfoot.getRandomNumber(700)-0,Greenfoot.getRandomNumber(700)-0);
        Rival rival2 = new Rival();
        addObject(rival2,Greenfoot.getRandomNumber(700)-0,Greenfoot.getRandomNumber(700)-0);
        Rival rival3 = new Rival();
        addObject(rival3,Greenfoot.getRandomNumber(700)-0,Greenfoot.getRandomNumber(700)-0);        
    }
    public void act()
    //Muestra la puntuación, y el tiempo. Cuando este llega a 0 se detiene 
    //Cada 200 ciclos aparecen nuevas orders en lugares aleatorios 
    {
        showText("Score: " + score, 50, 30);
        showText("Time: " + timer, 50, 50);
        timer--;
        if (timer <= 0){
            Greenfoot.stop();
        }
        if (timer == 800)
        {
            order order0 = new order();
            addObject(order0,Greenfoot.getRandomNumber(700)-0,Greenfoot.getRandomNumber(700)-0);
            order ordera = new order();
            addObject(ordera,Greenfoot.getRandomNumber(700)-0,Greenfoot.getRandomNumber(700)-0);
            order orderb = new order();
            addObject(orderb,Greenfoot.getRandomNumber(700)-0,Greenfoot.getRandomNumber(700)-0);
            order orderc = new order();
            addObject(orderc,Greenfoot.getRandomNumber(700)-0,Greenfoot.getRandomNumber(700)-0);;
            
        }
        if (timer == 600)
        {
            order order0 = new order();
            addObject(order0,Greenfoot.getRandomNumber(700)-0,Greenfoot.getRandomNumber(700)-0);
            order ordera = new order();
            addObject(ordera,Greenfoot.getRandomNumber(700)-0,Greenfoot.getRandomNumber(700)-0);
            order orderb = new order();
            addObject(orderb,Greenfoot.getRandomNumber(700)-0,Greenfoot.getRandomNumber(700)-0);
            order orderc = new order();
            addObject(orderc,Greenfoot.getRandomNumber(700)-0,Greenfoot.getRandomNumber(700)-0);;
            
        }
        if (timer == 400)
        {
            order order0 = new order();
            addObject(order0,Greenfoot.getRandomNumber(700)-0,Greenfoot.getRandomNumber(700)-0);
            order ordera = new order();
            addObject(ordera,Greenfoot.getRandomNumber(700)-0,Greenfoot.getRandomNumber(700)-0);
            order orderb = new order();
            addObject(orderb,Greenfoot.getRandomNumber(700)-0,Greenfoot.getRandomNumber(700)-0);
            order orderc = new order();
            addObject(orderc,Greenfoot.getRandomNumber(700)-0,Greenfoot.getRandomNumber(700)-0);;
            
        }
        if (timer == 200)
        {
            order order0 = new order();
            addObject(order0,Greenfoot.getRandomNumber(700)-0,Greenfoot.getRandomNumber(700)-0);
            order ordera = new order();
            addObject(ordera,Greenfoot.getRandomNumber(700)-0,Greenfoot.getRandomNumber(700)-0);
            order orderb = new order();
            addObject(orderb,Greenfoot.getRandomNumber(700)-0,Greenfoot.getRandomNumber(700)-0);
            order orderc = new order();
            addObject(orderc,Greenfoot.getRandomNumber(700)-0,Greenfoot.getRandomNumber(700)-0);;
            
        }
        if (timer == 100)
        {
            order order0 = new order();
            addObject(order0,Greenfoot.getRandomNumber(700)-0,Greenfoot.getRandomNumber(700)-0);
            order ordera = new order();
            addObject(ordera,Greenfoot.getRandomNumber(700)-0,Greenfoot.getRandomNumber(700)-0);
            order orderb = new order();
            addObject(orderb,Greenfoot.getRandomNumber(700)-0,Greenfoot.getRandomNumber(700)-0);
            order orderc = new order();
            addObject(orderc,Greenfoot.getRandomNumber(700)-0,Greenfoot.getRandomNumber(700)-0);;
            
        }
    }  
}
