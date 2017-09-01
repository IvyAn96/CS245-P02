package edu.usfca.cs.cs245;

public class BinaryRecursiveSearch implements Practice2Search {


	@Override
	public String searchName() {
		
		return "BinaryRecursiveSearch";
	}

	@Override
	public int search(int[] arr, int target) {

			return searchH( arr, target, 0, arr.length - 1);
		}
	    
		public static int searchH (int[] arr, int target, int min, int max) {
			
			if(max >= min){
				int mid = (min + max) / 2;
				
			     if(arr[mid] == (target)){
						return mid;
					}
					  if(arr[mid] < target  ){
						searchH(arr, target, mid + 1 ,max);
					}
					  else{
				      return searchH(arr, target, min , mid - 1);
					}
			}
			  return -1;
	}

}
