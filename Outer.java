import java.util.*;
 class Unique
{
 public static void main(String[] args)
{
	 int[] arr={1,2,4,2,2,6,5,1,3};
	 Set<Integer> uset= new	HashSet<Integer>();
	 Set<Integer> dset= new	HashSet<Integer>();

	 for(int val:arr)
		 {
           if(!uset.add(val))
			   {
	       dset.add(val);
		   }
	 }
}
System.out.println(dset);
System.ouit.println(uset);
}
