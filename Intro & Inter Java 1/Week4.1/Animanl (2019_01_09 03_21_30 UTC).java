class Animal 
{    
    public Animal()
    {        
        System.out.println("A new animal has been created!");       
    }    
    public void sleep() 
    {        
        System.out.println("An animal sleeps...");       
    }    
    public void eat() 
    {        
        System.out.println("An animal eats...");
    }
} 

public class Catt extends Animal 
{    
    public Catt() 
    {        
        super();        
        System.out.println("A new cat has been created!");      
    }    
    public void sleep() 
    {        
        System.out.println("A cat sleeps...");      
    }    
    public void purr() 
    {        
        System.out.println("A cat purrs...");      
    }      
    public void eat() 
    {        
        System.out.println("An cat eats...");
    }      
    public static void main(String args[]) 
    {      
        Catt demo = new Catt();      
        demo.eat();      
        demo.sleep();      
        demo.purr();   
    }  
} 