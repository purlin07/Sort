public class Sort{
	public static void main(String[] args){
		System.out.println("Sort");
		int arr[] = {3,5,1,2,7,6};
        print(arr);
		insertionSort(arr);
		print(arr);
	}

	public static void insertionSort(int arr[]){
		int i,j,n;
		for(i=1;i<arr.length;i++){
			n=arr[i];
			j=i;
//			while(j>0&&arr[j-1]>n){
//				arr[j]=arr[j-1];
//				j--;
//			}
            for(;j>0;j--){
				if (arr[j-1]>n){
					arr[j]=arr[j-1];
				}else{
					break;
				}
			}			
			arr[j]=n;
		}
	}

	public static void print(int arr[]){
		for(int i = 0; i< arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
	}
}
