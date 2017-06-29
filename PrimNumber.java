import java.util.ArrayList;
import java.util.List;

class PrimeNumber{
	public static boolean isPrime(int x){
		for(int i = 2; i < x/2; i++){
			if(x % i == 0){
				return false;
			}
		}
		return true;
	}
	public static List<Integer> getPrimes(final List<Integer> numbers){
		List<Integer> storeNumbers = new ArrayList<Integer>();
		boolean result = true;
		for(int i = 0; i < numbers.size(); i++){
			result = isPrime(numbers.get(i));
			if(result)
				storeNumbers.add(numbers.get(i));
		}
		System.out.println("prime numbers are: ");
		for(int i = 0; i < storeNumbers.size(); i++){
			System.out.println(storeNumbers.get(i));
		}
		return numbers;
	}
	public static void main(String[] args){
		List<Integer> d = new ArrayList<Integer>();
		d.add(3);
		d.add(4);
		d.add(7);
		getPrimes(d);
	}
}