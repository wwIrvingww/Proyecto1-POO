import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ciudad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ciudad extends World
{

    /**
     * Constructor for objects of class ciudad.
     * 
     */
    public ciudad()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        order order = new order();
        addObject(order,151,399);
        order order2 = new order();
        addObject(order2,261,324);
        order order3 = new order();
        addObject(order3,340,248);
        order order4 = new order();
        addObject(order4,676,291);
    }
}
