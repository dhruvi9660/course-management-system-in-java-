package QuesandTest;

import java.util.*;

public class ScieQues

{

public static Vector<Questions> SciQues1()

{

Vector <Questions> vec = new Vector <Questions>(5);
int i;

Questions obj = new Questions();
obj.ques = ("Which is the fastest animal");
obj.ans = ("Leopard");
vec.add(obj);
Questions obj1= new Questions();
obj1.ques = ("Dissolving sugar in water is a/an _________ change");
obj1.ans = ("Irreversible");
vec.add(obj1);
Questions obj2= new Questions();
obj2.ques = ("Carbohydrates provide _____________ to the body");
obj2.ans = ("Energy");
vec.add(obj2);
Questions obj3= new Questions();
obj3.ques = ("The motion described by a simple pendulum is _________ motion");
obj3.ans =("periodic");
vec.add(obj3);
Questions obj4= new Questions();
obj4.ques = ("Deer eats only plant products and so is called");
obj4.ans = ("Herbivore");
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

