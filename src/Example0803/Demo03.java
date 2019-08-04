package Example0803;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo03 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*
		 * 	对象操作流的优化- 存多个对象时，将对象存在list中
		 */
		//test1();
		
		//
		FileInputStream fis=new FileInputStream("C:\\Users\\YQF\\Desktop\\a/f.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		//读取List对象
		Object obj=ois.readObject();
		//把obj转成list
		@SuppressWarnings("unchecked")
		List<GirlFriend> list=(List<GirlFriend>) obj;
		//遍历
		for(GirlFriend gf:list) {
			System.out.println(gf);
		}
		
		ois.close();
		fis.close();
	}

	private static void test1() throws FileNotFoundException, IOException {
		//把GirlFriend对象存入List中，再把List写入文件中
		//1.创建List集合
		List<GirlFriend> list=new ArrayList<GirlFriend>();
		//2.添加至list集合中
		list.add(new GirlFriend("Elizabthe Olsan", 180));
		list.add(new GirlFriend("林志玲", 178));
		//3.把list存入文件
		FileOutputStream fos=new FileOutputStream("C:\\Users\\YQF\\Desktop\\a/f.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		fos.close();
	}
}
