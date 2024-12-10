/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {  
    //un sorted arry
    var arr = intArrayOf(4,23,7,3,2,78,9,6543,22,5,576,36,865,4634,534,5634,)
    
   	print("UnSorted Array \n")
    for(i in arr){
        print("$i ")
    }
    println()
    
    var soredArray = bubbleSort(arr)
   	print("bubbleSort: Sorted Array \n")
    for(i in soredArray){
        print("$i ")
    }
    println()
    println()
    
    
    var searchTrueInput = 9
    var searchFalseInput = 432
    println("Linear Search")
    println(" $searchTrueInput ${linearSearch(arr,searchTrueInput)}")
    println(" $searchFalseInput ${linearSearch(arr,searchFalseInput)}")
    
    
    println()
    println("Binary Search")
    println("  $searchTrueInput ${binarySearch(soredArray,searchTrueInput)}")
    println("  $searchFalseInput ${binarySearch(soredArray,searchFalseInput)}")
    
    
}

fun linearSearch(arr: IntArray,search : Int): Boolean{
    for(i in arr){
        if(i == search){
            return true
        }
    }
    return false
}

fun bubbleSort(arr: IntArray): IntArray{
    for (i in 0 until arr.size) {
        var swapped = false
        for (j in 0 until arr.size - i - 1) { // Use 'until' to avoid accessing out-of-bounds
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
                swapped = true
            }
        }
        if (!swapped) break // If no swaps were made, the array is already sorted
    }
    return arr
}
 
fun binarySearch(arr: IntArray,search : Int): Boolean{
    var low = 0
    var high = arr.size-1 
    
    while(low <= high){
        var mid = low + (high - low) /2 
        if(arr[mid] == search){
            return true
        }else if(search < arr[mid]){
            high = mid-1
        }else if(search > arr[mid]){
            low = mid+1
        }
    }
 
    
    return false
}
