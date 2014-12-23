
public class Sort{

	public static void main(String[] args){
		System.out.println("Sort");
		int arr[] = getArr(10);
		System.out.println("Insertion Sort");
		insertionSort(arr);

		arr = getArr(10);
		System.out.println("Shell Insertion Sort");
		shellSort(arr);

		arr = getArr(10);
		System.out.println("Bubble Sort");
		bubbleSort(arr);

		arr = getArr(10);
		System.out.println("Simple Selection Sort");
		simpleSelectionSort(arr);

		arr = getArr(10);
		System.out.println("Quick Sort");
		quickSort(arr,0,arr.length-1);		
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
	
	public static void simpleSelectionSort(int arr[]){
		int min,tem;
		for(int i=0;i<arr.length;i++){
			min=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[min]>arr[j]){
					min=j;
				}	
			}
			if(min!=i){
				tem=arr[i];
				arr[i]=arr[min];
				arr[min]=tem;
			}
			print(arr);
		}
	}

	public static void bubbleSort(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int tem=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tem;
				}
			}
			print(arr);
		}
	}

	public static void quickSort(int arr[],int left,int right){		
		System.out.println("============recursion==============");
		print(arr);
		int index = quickSortPatition(arr,left,right);
		System.out.println("index = " + index);
		if(left < index - 1){
			quickSort(arr,left,index-1);
		}
		if(right > index){
			quickSort(arr,index,right);
		}
	}

	public static int quickSortPatition(int arr[],int left,int right){
		int tem;
		int pivot = arr[left];
		System.out.println("pivot = "+pivot);
		while(left<=right){
			while(arr[left]<pivot){
				left++;
			}
			while(arr[right]>pivot){
				right--;
			}
			if(left<=right){
				tem = arr[right];
				arr[right]=arr[left];
				arr[left]=tem;
				System.out.println("left="+left+" right="+right+" swap");
				print(arr);
				left++;
				right--;
			}
		}
		return left;
	}



	public static void print(int arr[]){
		for(int i = 0; i< arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
	}

	public static int[] getArr(int size){
		int[] arr = new int[size];
		int item=0;
		for(int i =0; i<size; i++){
			item=(int)(Math.random()*100);
			arr[i]= item;
		}
		return arr;
	}
}
