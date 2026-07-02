package array;

public class MultiDimentionalArray {
	public static void main(String[] args){
		int[][][] b = new int[2][2][2];
		for(int i=0; i<2;i++){
			for(int j=0;j<2;j++){
				for(int k=0;k<2;k++){
					b[i][j][k]=1;
				}
			}
		}
		
		for(int i=0; i<2;i++){
			for(int j=0;j<2;j++){
				for(int k=0;k<2;k++){
					System.out.print(b[i][j][k]+" ");
				}
			}
			System.out.println();
		}
	}

}
