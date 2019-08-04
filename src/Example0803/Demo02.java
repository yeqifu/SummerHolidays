package Example0803;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Demo02 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*
		 * 	ObjectInputStream和ObjectOutputStream
		 *  ObjectInputStream:将一个对象写入文件
		 *  	1.如果使用这个类写入对象，这个对象需要序列化
		 *  	2.序列化就是让这个类实现Serializable接口
		 *  	3.如果没有实现Serializable接口，会抛出NotSerializableException这个异常
		 *  ObjectOutputStream:从文件中读一个对象
		 *  
		 *  	序列化(归档):将对象存在一个文件的过程
		 *  	反序列化(解归档):把一个文件解析出对象
		 */
		
		//test1();
		
		//从文件中取出女朋友对象
		FileInputStream fis=new FileInputStream("C:\\Users\\YQF\\Desktop\\a/e.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);

		GirlFriend gf3=(GirlFriend) ois.readObject();
		System.out.println(gf3);
		
	
		GirlFriend gf4=(GirlFriend)ois.readObject();
		System.out.println(gf4);
		ois.close();
		fis.close();
	}

	private static void test1() throws FileNotFoundException, IOException {
		//1.创建GirlFriend对象
		GirlFriend gf1=new GirlFriend("Scarlett Johansson",30);
		GirlFriend gf2=new GirlFriend("林志玲", 35);
		//2.声明ObjectOutputStream和FileOutputStream对象
		FileOutputStream fos=new FileOutputStream("C:\\Users\\YQF\\Desktop\\a/e.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		//3.往文件中存入对象
		oos.writeObject(gf1);
		oos.writeObject(gf2);
		//4.关流
		oos.close();
	}
}
class GirlFriend implements Serializable{
	String name;
	double height;
	public GirlFriend(String name, double height) {
		super();
		this.name = name;
		this.height = height;
	}
	@Override
	public String toString() {
		return "GirlFriend [name=" + name + ", height=" + height + "]";
	}
	
}
