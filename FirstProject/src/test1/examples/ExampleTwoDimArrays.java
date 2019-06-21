package test1.examples;

public class ExampleTwoDimArrays {

	public static void main(String[] args) {
		
int[][] TwoDim = new int[3][4];
//TwoDim[2][1] = 10;
//TwoDim[Row][Column] = Value;
int temp = 10;

for(int i = 0; i < 3; i++){
	for(int j = 0; j < 4; j++){
		TwoDim [i][j] = temp;
		temp += 10;
			}
}

for(int i = 0; i < 3; i++){
	for(int j = 0; j < 4; j++){
		System.out.print(TwoDim[i][j] + " ");
			}System.out.println();
}
	}

}
