public class Qno2 
{
        public static void main(String[] args)
        {
		System.out.println(new Qno2().run());
	}
        int n = 100;
	public String run()
        {
		int sum = 0;
		int sum2 = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
			sum2 += i * i;
		}
return Integer.toString(sum * sum - sum2); //Converting integer to String
	}
}
  