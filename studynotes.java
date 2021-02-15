package studymaterial;
import java.util.*;
abstract class Studymaterial{
	abstract  void java();
	abstract  void science();
}
public class studynotes extends Studymaterial{
	public  void java(){
while(true){	
		System.out.println("\n");
	System.out.println("1.Vectors in java");
	System.out.println("2.jagged array");
	System.out.println("3.Packages");
	System.out.println("4.exit subject java");
	System.out.println("select the lesson for which you want study notes");
	Scanner sc = new Scanner(System.in);
	int c = sc.nextInt();
	switch(c){
		case 1:{
			System.out.println("\n********************************************************************************************\n\n");
			System.out.println("Vector implements a dynamic array of objects.\nVector proves to be very useful if you don't know the size of\nthe array in advance or you just need one that can change\nsizes over the lifetime of a program.\nVector can contain heterogeneous objects");
			System.out.println("We cannot store elements of primitive data type first it\nneed to be converted to objects. A vector can store any objects.\nIts defined in java.util package and class member of the Java Collections Framework.");
			System.out.println("Vector implements List Interface\nA vector has an initial capacity, if this capacity is reached then size of vector automatically increases\nThis default initial capacity of vectors are 10.\nTo traverse elements of a vector class we use Enumeration interface.");
			System.out.println("for more information refer: https://www.javatpoint.com/java-vector");
			break;
			}
		case 2:{
			System.out.println("\n********************************************************************************************\n\n");
			System.out.println("Jagged array is array of arrays such that member arrays can be of different sizes, i.e., we can create a 2-D arrays but with variable number of columns in each row. These type of arrays are also known as Jagged arrays.");
			System.out.println("class TestJaggedArray{\npublic static void main(String[] arg)\n{\nint arr[][] = new int[3][];\narr[0] = new int[3];\narr[1] = new int[4];\narr[2] = new int[2];\n//initializing a jagged array\nint count = 0;\nfor (int i=0; i<arr.length; i++)\nfor(int j=0; j<arr[i].length; j++)\narr[i][j] = count++;");
			System.out.println("//printing the data of a jagged\n//array\nfor (int i=0; i<arr.length; i++){\nfor (int j=0; j<arr[i].length; j++)\n{\nSystem.out.print(arr[i][j]+ );\n}\nSystem.out.println();\n}\n}\n}");
			System.out.println("for more information refer : https://www.geeksforgeeks.org/jagged-array-in-java/ ");
			break;
		}

		case 3:{
			System.out.println("\n********************************************************************************************\n\n");
			System.out.println("A Package can be defined as a grouping of related types (classes,interfaces, enumerations providing access protection and name space management.\nA package may consists of a lot of classes but only few needs to be exposed as most of them are required internally.\nThus, we can hide the classes and prevent programs or other packages from accessing classes which are meant for internal usage only.\nThus it help to achieve data encapsulation.");
			System.out.println("for more information refer: https://www.geeksforgeeks.org/packages-in-java/");
			break;
		}
		case 4:{
			return;
		}
		
	}


}
	}
	 public  void science(){
		while(true){
		System.out.println("1.alkanes");
	System.out.println("2.plant cell");
	System.out.println("3.laws of motion");
	System.out.println("4.exit subject science");
	System.out.println("select the lesson for which you want study notes");
	Scanner sc = new Scanner(System.in);
	int ch = sc.nextInt();
	switch(ch){
		case 1:{
			System.out.println("\n********************************************************************************************\n\n");
			System.out.println("1. Which of the following conformation of n-butane is the most stable?\n(a) eclipsed\n(b) gauche\n(c) staggered\n(d) skew boat\n2. Find the correct order for relative energies of the ethane conformations\n(a) staggered < skewed < eclipsed\n(b) skewed < staggered < eclipsed\n(c) skewed < eclipsed < staggered\n(d) staggered < eclipsed < skewed");
			System.out.println("\n3. Find the alkane (C5H12), which will give only one type of monohalogenated compound\n(a) 2,2-dimethylpropane\n(b) 2-methylbutane\n(c) cyclopentane\n(d) n-pentane\n4. The bond angle between H-C-C bonds in ethane is\n(a) 120°\n(b) 180°\n(c) 109°\n(d) 109.5°\n5. Alkanes undergo halogenation. It is an example of\n(a) nucleophilic substitution\n(b) elimination\n(c) free-radical substitution\n(d) electrophilic substitution");
			System.out.println("\n1. (c)	2. (a)	3. (a)	4. (d)	5. (c)");
			break;
		}
		case 2:{
			System.out.println("\n********************************************************************************************\n\n");
			System.out.println("1. In plant cell, cell wall is____\n2.______organisms have only one cell.​");
			System.out.println("3.Cell wall of plants cells is formed of ________");
			System.out.println("4. Green plastids are called _______.\n5.Plant cell has a big central _______.");
			System.out.println("ANS : 1. present 2. Unicellular 3.cellulose 4.chloroplast 5.vacoule");
			break;
		}
		case 3:{
			System.out.println("\n********************************************************************************************\n\n");
			System.out.println("In the first law, an object will not change its motion unless a force acts on it. \nIn the second law, the force on an object is equal to its mass times its acceleration.\n In the third law, when two objects interact, they apply forces to each other of equal magnitude and opposite direction.");
			System.out.println("Newtons first law of motion is also called law of ________________. ");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			break;
		}
		case 4:{
			return;
		}
		
	}
	}
}

	}
