public class Sort{
	public static void main(String[] args){
		System.out.println("Sort");
		int arr[] = {3,9,1,2,7,6};
        print(arr);
	//	System.out.println("Insertion Sort");
	//	insertionSort(arr);
		System.out.println("Shell Insertion Sort");
		shellSort(arr);
//		shellInsertionSort(arr,3);
		//print(arr);
	}

	public static void insertionSort(int arr[]){
		int i,j,n;
		for(i=1;i<arr.length;i++){
			n=arr[i];
//			while(j>0&&arr[j-1]>n){
//				arr[j]=arr[j-1];
//				j--;
//			}
            for(j=i;j>=1;j--){
				if (arr[j-1]>n){
					arr[j]=arr[j-1];
				}else{
					break;
				}
			}			
			arr[j]=n;
			print(arr);
		}
	}


	public static void shellSort(int arr[]){
		int gap = arr.length/2;
		while(gap>=1){
			shellInsertionSort(arr,gap);
			gap=gap/2;
		}
	}
	public static void shellInsertionSort(int arr[],int gap){
		int i,j,n;
		for(i=gap;i<arr.length;i++){
			n=arr[i];
			for(j=i;j>=gap;j=j-gap){
				if(arr[j-gap]>n){
					arr[j]=arr[j-gap];
				}else{
					break;
				}
			}
			arr[j]=n;
			print(arr);
		}
	}

	public static void print(int arr[]){
		for(int i = 0; i< arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
	}
}
