package basic_programs;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {3,45,355,35,76,23,68,98,76,86,34,21,39,-1};
		int target = 76;
		int res = linearSearch1(arr, target);
		System.out.println(res);
	}

	static int linearSearch1(int[] arr, int target){
		if(arr.length==0){
			return -1;
		}
		for(int index =0; index<arr.length; index++){
			if(arr[index] == target){
				return index;
			}
		}
		return -1;
	}


	static int linearSearch2(int[] arr, int target){
		if(arr.length==0){
			return -1;
		}
		for(int element : arr){
			if(element == target){
				return element;
			}
		}
		//return -1;
		return Integer.MAX_VALUE;
	}

	static boolean linearSearch3(int[] arr, int target){
		if(arr.length==0){
			return false;
		}
		for(int element : arr){
			if(element == target){
				return true;
			}
		}
		return false;
	}


	//linear search for a String in a String array
	static String linearSearchPractice(String[] arr, char target){
		if(arr.length==0){
			return null;
		}
		for(String i:arr){
			if(i.equals(target)){
				return i;
			}
		}
		return null;
	}

	//linear search for a character in a string array
	static int linearSearchForChar(String st,char target){
		if(st.length()==0){
			return -1;
		}
		for(char a:st.toCharArray()) {  //use st.charAt() also
			if(a==target)
				return a;
		}
		return -1;
	}

	//Search for the element in the range 1 to 5 . Here simply change the for loop
	static int linearSearchInParticularRange(int[] arr,int target, int startIndex, int endIndex){
		if(arr.length==0){
			return -1;
		}
		for(int index = startIndex; index<=endIndex; index++){
			if(arr[index]==target){
				return index;
			}
		}
		return -1;
	}
}
