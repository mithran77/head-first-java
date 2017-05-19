class Dog
{
    int size;
    String name;
    String breed;

    public void bark ()
    {
	System.out.println("Ruff Ruff!!");
    }
}

public class DogTestDrive
{
    public static void main (String[] args)
    {
	Dog d = new Dog();
	d.name = "Max";
	d.breed = "labrador";
	d.bark();
    }
}
