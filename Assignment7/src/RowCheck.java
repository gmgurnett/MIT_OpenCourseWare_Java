import java.io.*;


public class RowCheck {
	public static void checkRows(BufferedReader file, String fileName) throws IOException{
		boolean rowSumIsConstant = true;
		String line = file.readLine();
		String[] nums;
		int rowSum = 0;
		
		if(line != null) {
			nums = line.split("\t");
			
			for(int i = 0; i < nums.length; i += 1) {
				rowSum += Integer.valueOf(nums[i]);
			}
		}
		
		line = file.readLine();
		
		while(line != null) {
			nums = line.split("\t");
			int runningSum = 0;
			
			for(int i = 0; i < nums.length; i +=1) {
				runningSum += Integer.valueOf(nums[i]);
			}
			
			if(runningSum != rowSum) {
				rowSumIsConstant = false;
				break;
			}
			
			line = file.readLine();
			}
		
		if(rowSumIsConstant) {
			System.out.println("All of the rows in file" + fileName + " add to the constant " + rowSum + ".");			
		}
		else {
			System.out.println("The rows in file " + fileName + " do not add to the same constant.");
		}
}
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fileName1 = "Mercury.txt";
		String fileName2 = "Luna.txt";
		
		FileReader mercury = new FileReader(fileName1);
		FileReader luna = new FileReader(fileName2);
		
		BufferedReader mercuryTxt = new BufferedReader(mercury);
		BufferedReader lunaTxt = new BufferedReader(luna);
		
		checkRows(mercuryTxt, fileName1);
		checkRows(lunaTxt, fileName2);
	}

}
