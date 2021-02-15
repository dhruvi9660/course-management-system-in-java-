package QuesandTest;

import java.util.*;

public class JavaQues

{

public  static Vector<Questions> JavaQues1()

{


Vector <Questions> vec = new Vector <Questions>(5);
int i;

Questions obj = new Questions();
obj.ques = ("The output of the java compiler is known as:");
obj.ans = ("Bytecode");
vec.add(obj);
Questions obj1= new Questions();
obj1.ques = ("It is possible to throw exceptions explicitly using the __________ keyword");
obj1.ans = ("throw");
vec.add(obj1);
Questions obj2= new Questions();
obj2.ques = ("Java uses __________ to represent characters");
obj2.ans = ("Unicode");
vec.add(obj2);
Questions obj3= new Questions();
obj3.ques = ("A _________ is a collection of classes and interfaces");
obj3.ans =("Package");
vec.add(obj3);
Questions obj4= new Questions();
obj4.ques = ("_________ keyword declares a class variable that is shared among all instances of the class");
obj4.ans = ("static");
vec.add(obj4);
for(i=0;i<vec.size();i++)
{
Questions obj5 = new Questions();
obj5= vec.elementAt(i);
System.out.print(" " +(i+1)+ ". ");
System.out.println(" Question:  "+obj5.ques);
System.out.println("Answer:  "+obj5.ans);
}
return vec;
}

}
