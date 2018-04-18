package org.java.derekBanas.OOP;

public class WorkWithAnimal {
	
	int justANum = 10;
	
	public static void main(String[] args){
		
		Dog fido  = new Dog();
		
		fido.setName("Fido");
		System.out.println(fido.getName());
		fido.digHole();
		fido.setWeight(-1);
		
		int randNum = 10;
		fido.changeVar(randNum);
		
		System.out.println("Rand num after method call -"+randNum);
		
		changeObjectName(fido);
		System.out.println("Dog name after method call-"+fido.getName());
		
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		
		System.out.println("Doggy Says :"+ doggy.getSound());
		System.out.println("Kitty Says :"+ kitty.getSound());
		
		Animal[] animals = new Animal[4];
		animals[0]=doggy;
		animals[1]=kitty;
		
		System.out.println("Doggy Says :"+ animals[0].getSound());
		System.out.println("Kitty Says :"+ animals[1].getSound());
		
		speakAnimal(doggy);
		
		((Dog)doggy).digHole();
		
		//System.out.println(justANum);
		//sayHello();
		
		fido.accessPrivate();
		
		Girafee girafee = new Girafee();
		girafee.setname("Frank");
		System.out.println(girafee.getname());
		
		
	}
	
	public static void changeObjectName(Dog fido){
		fido.setName("Marcus");
	}

	public static void speakAnimal(Animal randAnimal){
		System.out.println("Animal says - "+ randAnimal.getSound());
	}
	
	public void sayHello(){
		System.out.println("Hello");
	}
}
