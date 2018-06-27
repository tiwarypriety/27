import java.io.*;

public class MultipleObjectCreation {

			public static void main(String[] args) throws IOException, ClassNotFoundException
			{
				Customer c1 =new Customer();
				Customer c2 =new Customer();
				c1.setId(100);
				c1.setAddress("India");
				c1.setName("Amay");
				c2.setId(200);
				c2.setAddress("china");
				c2.setName("Amit");
			FileOutputStream fout = new FileOutputStream("d:/file.txt");
			ObjectOutputStream out1 =new ObjectOutputStream(fout);
			out1.writeObject(c1);
			out1.writeObject(c2);
			FileInputStream fin = new FileInputStream("d:/file.txt");
			ObjectInputStream out2 = new ObjectInputStream(fin);
			Customer cus = (Customer) out2.readObject();
			System.out.println("Customer Details: "+cus.getId()+" "+cus.getName()+" "+cus.getAddress());
			System.out.println("Customer Details: "+cus.getId()+" "+cus.getName()+" "+cus.getAddress());
		}

	}

