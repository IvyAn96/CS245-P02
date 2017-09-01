package edu.usfca.cs.cs245;

public class BinaryIterativeSearch implements Practice2Search {

	@Override
	public String searchName() {
		return "BinaryIterativeSearch";
	}

	@Override
	public int search(int[] arr, int target) {
		int min = 0;
		int max = arr.length - 1;
		
		while(min <= max) {
			int mid = (max + min) / 2;
		
			if(arr[mid] == target){
				return mid;
			}
			if(arr[mid] < target){
				min = max + 1;
			}else {
				max = mid - 1;
			}
			
			}	
		return -1;
	}
		
	}


