import java.io.Serializable;

public class Customer implements Serializable{
int id;
String name;
String address;
Customer(){}
public Customer(int id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getAddress() {
	return address;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setAddress(String address) {
	this.address = address;
}

}
