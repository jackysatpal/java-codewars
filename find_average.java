public class Kata{
  public static double find_average(int[] array){
  	int total = array.length;
  	int sum = 0;
  	for(int i = 0; i < total; i++){
  		sum += array[i];
  	}
  	int avg = (double) sum / total;
  	return avg;
  }
}