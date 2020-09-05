package p1;

import java.lang.reflect.Method;

public class ReflectDemoMainClass {

	public static void main(String[] args)throws Exception
	{
		
		MyClass obj1 = new MyClass();
				
		
		  Class ref = Class.forName("p1.MyClass"); 
		  Object obj2 = ref.newInstance();
		 
		  Method m = ref.getDeclaredMethod("doThings", int.class,int.class);
		  m.invoke(obj2, 15,58);
		  System.out.println("end");
		
		
		/*
		 * Class ref = MyClass.class; String name = ref.getName(); Method arr[] =
		 * ref.getMethods(); for (Method method : arr) { System.out.println(method);
		 * method.getName();
		 * 
		 * }
		 */
		
	}
}
