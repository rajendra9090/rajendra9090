package co.jsoftware;

public class RemoveDuplicacy1 {

	public static void main(String[] args) {
		int []a= {1,2,2,3,4,5,5};
		int[]temp=new int[a.length];
		int j=0;
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]!=a[i]) {
				temp[j]=a[i];
				j++;
			}
			temp[j]=a[a.length-1];
			for (int j1 = 0; j1 < temp.length; j1++) {
				
			}
			System.out.println(temp);
		}
		
	}

}
