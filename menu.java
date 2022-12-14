import greenfoot.*;  

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{   
    arrow arrow=new arrow();
    private int opcion=0;
    /**
     * Constructor for objects of class menu.
     * 
     */
    public menu()
    {    
       //Crea el mundo 
        super(900, 700, 1); 
        prepararMundo();
    }

    private void prepararMundo()
    //Agrega la flecha en un lugar predeterminado 
    { 
        addObject(arrow,300,290);    
    }
    
    public void act(){
        //Hace que la flecha se mueva en base a la tecla que presione el usuario 
        if (Greenfoot.isKeyDown("up") &&  opcion!=0) 
        {
            opcion++;
        }
        if (Greenfoot.isKeyDown("down") &&  opcion!=1) 
        {
            opcion--;
        }
        
        if (opcion>=2) opcion=0;
        if (opcion<0) opcion=1;
        
        arrow.setLocation(300,290+(opcion*120));
        
        if (Greenfoot.isKeyDown("SPACE") || Greenfoot.isKeyDown("ENTER")){
            switch(opcion){
                  case 0:// jugar
                       Greenfoot.setWorld(new ciudad());
                       break;
                  case 1:// salir
                       Greenfoot.stop();
                       break;
            }        
        }  
    }
}
