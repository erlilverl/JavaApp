class Parent{
	void display(){	
		System.out.println("Method in Parent");
	}
}
class Child extends Parent{
	void display(){
		System.out.println("Method in child");
		System.out.println("Sub class of Parent");
	}
}
class Main{
	public static void main(String args[]){
		Parent p=new Parent();
		p.display();
		Child c=new Child();
		c.display();
	}
}