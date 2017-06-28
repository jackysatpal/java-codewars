import java.util.Arrays;
public class Kata{
	public static String HighAndLow(String numbers){
	//spliting array by spaces	
	String [] strs = numbers.split(" ");
	//creating a new array of integers
	Integer [] ints = new Integer[strs.length];
	//copying elements to new integer array
	for(int i = 0; i < strs.length; i++){
		ints[i] = Integer.parseInt(strs[i]);
	}
	//assigning max and min values
	Integer max = ints[0];
	Integer min = ints[0];
	//comparing each elements of the array
	for(int i = 0; i < strs.length; i++){
		if(max > ints[i]){
			max = ints[i];
		}
		if(min < ints[i]){
			min = ints[i];
		}
	}
	//returning Integers as strings
	return max.toString() + " " + min.toString();
	}
}
