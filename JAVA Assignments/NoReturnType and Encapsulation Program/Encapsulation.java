class Encapsulation{
String name;
int age;

public String getName(){
return this.name;
}
public void setName(){
this.name=name;
}
public int getAge(){
	return this.age;
}
public void setAge(){
	this.age=age;
}

} 
 class MainEncapsulation{
	 Encapsulation encapsulation = new Encapsulation();
	 encapsulation.setName("Anushree")
	 encapsulation.setAge(24);
	 
 }