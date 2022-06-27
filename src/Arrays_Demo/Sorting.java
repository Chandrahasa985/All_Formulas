package Arrays_Demo;

public class Sorting {

	public static void main(String[] args) throws InterruptedException {

		long frst = System.currentTimeMillis(); 

		String str = "adarsh";
		char chary[] = str.toCharArray();
		char temp;
		for (int i=0; i<chary.length; i++) {
			for (int j=i+1; j<chary.length; j++) {
				if(chary[i]>chary[j]) {
					temp = chary[i];
					chary[i] = chary[j];
					chary[j] = temp;
				}
			}
		}
		
		System.out.println(chary);
		Thread.sleep(100);
		long finish = System.currentTimeMillis();
		long totalTime = finish - frst; 
		System.out.println("Total Time for page load - "+totalTime);
	}

}
