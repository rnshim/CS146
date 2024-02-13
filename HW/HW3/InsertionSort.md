def insertionSort(arr):
	for i in range(1, len(arr)):
		key = arr[i]
		j = i-1
		while j >= 0 and key < arr[j] :
				arr[j + 1] = arr[j]
				j -= 1
		arr[j + 1] = key

Best Case: When the array is already sorted, algorithm iterates through the array once without hitting the while loop
=>Ω(n)
Worst Case: When the array is in reverse order, it iterates through the array and has to sort each subarray every time
n(n+1)/2
=>O(n^2)
Average Case: Assume half of the objects will need to be shifted, 
number of operations = n^2/2
O and Omega are not equal so there is no function for theta