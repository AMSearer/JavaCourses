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

public class Cat extends Animal 
{    
    public Cat() 
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
        Cat demo = new Cat();      
        demo.eat();      
        demo.sleep();      
        demo.purr(); 
        
        Dog demoDog = new Dog();
        demoDog.eat();
        demoDog.sleep();
        demoDog.bark();
    }  
}

class Dog extends Animal
{
	public Dog()
	{
		super();
		System.out.println("A new dog has been created!");
	}
	public void sleep() 
	{
		System.out.println("A dog sleeps...");
	}
	public void bark()
	{
		System.out.println("A dog barks...");
	}
}