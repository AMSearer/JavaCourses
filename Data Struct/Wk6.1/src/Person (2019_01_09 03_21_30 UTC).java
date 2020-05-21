
public class Person implements Comparable
{
	String name;
	
	/**
	 * Constructs a Person object without an empty name.
	 */
	public Person()
	{
		name ="";
	}
	
	/**
	 * Constructs a Person object.
	 * @param nameIn Fills the Person.name field.
	 */
	public Person(String nameIn)
	{
		name = nameIn;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * 
	 * Defines the comparable interface for the Person object.
	 * Returns -1 if name is before friend.name, +1 if it is after, and 0 if they are the same.
	 * 
	 */
	public int compareTo(Object friendIn)
	{
		Person friend = (Person) friendIn;
		return name.compareTo(friend.name);

	}
	
	/**
	public static void main(String[] args)
	{
		Person demo1 = new Person("Alice");
		Person demo2 = new Person("Billy");
		
		System.out.println(demo1.name);
		System.out.println(demo1.name.compareTo(demo2.name));
		System.out.println(demo1.compareTo(demo2));
	}
	**/
	

}