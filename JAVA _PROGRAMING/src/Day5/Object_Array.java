package Day5;

public class Object_Array {

	public static void main(String[] args)
	{
		
	//single dimensional array
		//object a[]=new object[5];
		
	/*	Object a[]= {10,10.5,"welcome",true,'A'};
      for(Object val :a)
      {
    	  System.out.println(val);
      }*/
      //Two dimensional array
      Object b[][]= {{10,20.5},
    		  {"selenium",20.5},
    		  {"welcome","java"}
    		  };
      
      //to read values from this array we have to use enhanced for loop
      for(Object x[]:b)
      {
    	  for(Object var:x)
    	  {
    		  System.out.println(var);  
    	  }
      
      }
      
	}
}
	
