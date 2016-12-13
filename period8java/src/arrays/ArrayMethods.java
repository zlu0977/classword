package arrays;


public class ArrayMethods {

    public static void main(String[] args) {
    
     /**
      * IMPORTANT NOTE: 
      * This homework assignment will be weighted 4x.
      * DO NOT ASSUME my tests are perfect! If you have code that you think should work, 
      * but you keep failing the tests PLEASE bring it to my attention so that I can fix the tests
      * DO NOT spend hours and hours trying to fix perfect code just because my test
      * says that it isn't perfect!
      * */
    	
    	int[] stuff = {4, 1, 6, 7, 16, 765, 656, 5, 25, 2};
<<<<<<< HEAD
    	int[] stuff2 = {10, 9, 8, 7, 6, 5};
    	//reverseOrder(stuff);
    	//ArrayPractice.print(stuff);
    	
    	//System.out.print(searchUnsorted(stuff, 11));
    	//System.out.print(searchSorted(stuff2, 10));
    	
    	/*if(isSorted(stuff2))
    		System.out.print("sorteed");
    	else
    		System.out.print("not");*/
    		
=======
    	int[] stuff2 = {1,3,5,3,4};
    	int[] stuff3 = {3,5,0,3,5,3};
    	//reverseOrder(stuff);
    	//ArrayPractice.print(stuff);
    	
    	//System.out.print(searchUnsorted(stuff, 11));
    	//System.out.print(searchSorted(stuff2, 10));
    	
    	/*if(isSorted(stuff2))
    		System.out.print("sorteed");
    	else
    		System.out.print("not");*/
    	
    	System.out.println(longestSharedSequence(stuff2, stuff3));	
>>>>>>> refs/remotes/origin/master
    		
    }
    
    public static int searchUnsorted(int[] arrayToSearch, int key){
    /**
     * this method take an unsorted int array (arrayToSearch) and returns an 
     * int corresponding to the index of a key, if it is in the array
     * if the key is not in the array, this method returns -1
     * */
	    for(int i = 0; i < arrayToSearch.length; i ++)
	    	if(arrayToSearch[i] == key)
	    		return i;
	    
	    return -1;
    }
    
    public static int searchSorted(int[] sortedArrayToSearch, int key){
    /**
     * this method is exactly like the one above, except the parameter sortedArrayToSearch will
     * always be sorted in DESCENDING order. Again return the index of the key or return -1
     * if the key is not in the array
     * 
     * Note: You should attempt to write a method that is more efficient that searchUnsorted
     * */
    	boolean isFinished = false;
    	int minIndex = 0;
    	int maxIndex = sortedArrayToSearch.length - 1;

    	while(!isFinished)
    	{
    		int targetIndex = maxIndex - ((int)((maxIndex-minIndex)/2));
    		if(minIndex == 0 && maxIndex == 1)
    			targetIndex = 0;
    		
    		if(sortedArrayToSearch[targetIndex] == key)
    			return targetIndex;
    		else if(sortedArrayToSearch[targetIndex] > key)
    			minIndex = targetIndex;
    		else if(sortedArrayToSearch[targetIndex] < key)
    			maxIndex = targetIndex;
    		
    		if(minIndex >= maxIndex)
    			isFinished = true;
    	}
    	
    	return -1;
    }
    
    public static boolean isSorted(int[] array){
        /**
         * This method takes an in array as a parameter and returns 'true' if the array is already sorted in DESCENDING order
         * */
    	for(int i = 0; i < array.length; i++)
    		if(i != array.length - 1)
    			if(array[i] < array[i + 1])
	    			return false;
    	
        return true;
    }
    
    
    public static double[] getStats(double[] array){
        /** 
         * This method return a double[] contain a WHOLE BUNCH of stats
         * The double array must keep the following stats about the array parameter:
         * index 0 = the mean
         * index 1 = the max
         * index 2 = the min
         * index 3 = the median
         * index 4 = the number of values greater than or equal to the mean
         * index 5 = the number of values below the mean
         * */
	     double[] stats = new double[6];
	     
	     double mean = 0;
	     double max = 0;
	     double min = array[0];
	     double median = 0;
	     double meanPlus = 0;
	     double meanMinus = 0;
	     
	     for(int i = 0; i < array.length; i++)
	     {
	     	mean += array[i];
	     	
	     	if(max < array[i])
				max = array[i];
			
			if(min > array[i])
				min = array[i];
	     }
	     
	     mean = mean/array.length;
	     stats[0] = mean;
	     stats[1] = max;
	     stats[2] = min;
	     
	     for(double num : array)
	     {
	    	 if(num < mean)
	    		 meanMinus ++;
	    	 else
	    		 meanPlus ++;
	     }
	     
	     stats[4] = meanPlus;
	     stats[5] = meanMinus;
	    
	     while(array.length > 2)
	     {
<<<<<<< HEAD
	    	 int minIndex = indexOf(array, min, 0); 
	    	 array = excludeFromArray(array, minIndex);
	    	 int maxIndex = indexOf(array, max, 0);
	    	 array = excludeFromArray(array, maxIndex);
=======
	    	 array = excludeFromArray(array, min);
	    	 array = excludeFromArray(array, max);
>>>>>>> refs/remotes/origin/master
	    	 
	    	 double[] minMax = getMinMax(array);
	    	 min = minMax[0];
	    	 max = minMax[1];
	     }
	     
	     if(array.length == 2)
	    	 median = (array[0] + array[1])/2;
	     else
	    	 median = array[0];
	     
	     stats[3] = median;
	     
	     return stats;
    }
    
    public static void reverseOrder(int[] array){
        /**
         * this method reverses the order of the array passed to it.
         * Not that this method does not have a return type. You do not need to copy the array first
         * Furthermore, note that the array is not necessarily in any *particular* order. It may be 
         * in a random order, though you still need to reverse whatever order it is in
         * 
         * Example:
         * array = {5, 1, 9, 10, 16, -6}
         * after calling this method
         * array = {-6, 16, 10, 9, 1, 5}
         * 
         * */
    	
    	int temp;
    	for(int i = 0; i < array.length/2; i++)
    	{
    		temp = array[i];
    		array[i] = array[array.length-1-i];
    		array[array.length-1-i] = temp;
    	}
    }
    
    public static int countDifferences(int[] array1, int[] array2){
        /**Here, you will write an method that returns the number of values in two arrays 
         * that are NOT the same (either in value OR location).
         * The arrays ALWAYS have the same length
         * Examples:
         * countDifferences({1,2,3},{1,2,3}) returns 0, since these arrays are exactly the same
         * countDifferences({3,2,3,4},{3,2,5,4}) returns 1, since '3','2', and '4' are same value, same location, but the 3 and 5 are different
         * countDifferences({4,4,4,4},{1,2,3,4}) returns 3, since '4' is only at the same index ONE time and three others are not
         * countDifferences({1,2,3},{1,3,2}) returns 2, since '2' and '3' are both present, but different locations
         * 
         * */
        int differences = 0;
    	for(int i = 0; i < array1.length; i++)
    	{
    		if(array1[i] != array2[i])
    			differences ++;
    	}
    	
        return differences;
    }
    

    public static int longestConsecutiveSequence(int[] array1){
        /**This method counts the longest consequtive sequence in an array.
         * It does not matter where the sequence begins
         * If there are no consecutive numbers, the method should return '1'
         * 
         * Examples:
         * longestSequence({1,2,3,4,5,8,9}) returns '5', since the sequence '1,2,3,4,5' is 5 integers long 
         * longestSequence({0,9,10,11,4,3,8,9}) returns '3', since '9,10,11' is 3 integers long
         * longestSequence({0,9,8,11,4,3,7,9}) returns '1', since there are no consecutive integers
         * */
    	
    	int longestSeq = 1;
    	int currentSeq = 1;
    	
    	for(int i = 0; i < array1.length; i++)
    	{
    		if(i != array1.length - 1 && array1[i] + 1 == array1[i + 1])
    			currentSeq ++;
    		else
    		{
    			if(currentSeq > longestSeq)
    				longestSeq = currentSeq;
    			
    			currentSeq = 1;
    		}
    			
    	}
        
        return longestSeq;
    }

     public static int longestSharedSequence(int[] array1, int[] array2){
        /**This method counts the longest unbroken, shared sequence in TWO arrays.
         * The sequence does NOT have to be a consecutive sequence
         * It does NOT matter where the sequence begins, the arrays might not be the same length
         * 
         * Examples:
         * longestSequence({9,6,3,4,3,8,9}, {9,6,3,4,3,6,7}) returns '5', since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long 
         * longestSequence({0,9,6,3,4,3,8,9}, {1,2,9,6,3,4,3,6,7}) returns '5', 
         *          since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long, it doesn't matter that the sequence begins at different indices 
         * longestSequence({9,6,1,4,3,6,7,9}, {9,6,5,8,3,6,7,0}) returns '3', since the sequence '3,6,7' is in both arrays and is 3 integers long
         * */
<<<<<<< HEAD
    	int longestSeq = 1;
    	for(int i = 0; i < array1.length; i++)
    	{
    		int numIndex = 0;
    		int target = array1[i];
    		int currentSeq = 1;
    		boolean isFinished1 = false;
        			
    		while(!isFinished1)
    		{
    			boolean isFinished2 = false;
    			numIndex = indexOf(array2, target, numIndex);
    			if(numIndex < 0)
    				isFinished1 = true;
    			else
    			{
    				while(!isFinished2)
    				{
    					if(i != array1.length - 1 && numIndex != array2.length - 1)
	    					if(array1[i + 1] == array2[numIndex + 1])
	    					{
	    						currentSeq ++;
	    						i++;
	    					}
	    					else
	    					{
	    						if(currentSeq > longestSeq)
	    	        				longestSeq = currentSeq;
	    	        			
	    	        			isFinished2 = true;
	    					}
    					else
    					{
    						if(currentSeq > longestSeq)
    	        				longestSeq = currentSeq;
    	        			
    	        			isFinished2 = true;
    					}
    					
	    				numIndex ++;
    				}
    				
    				if(numIndex >= array2.length)
    					isFinished1 = true;
    			}
    		}
    	}
    	
    	return longestSeq;
=======
    	/*int longestSeq = 1;
    	for(int i = 0; i < array1.length; i++)
    	{
    		int numIndex = 0;
    		int target = array1[i];
    		int currentSeq = 1;
    		boolean isFinished1 = false;
        			
    		while(!isFinished1)
    		{
    			boolean isFinished2 = false;
    			numIndex = indexOf(array2, target, numIndex);
    			if(numIndex < 0)
    				isFinished1 = true;
    			else
    			{
    				while(!isFinished2)
    				{
    					if(i != array1.length - 1 && numIndex != array2.length - 1 && array1[i + 1] == array2[numIndex + 1])
    					{
    						currentSeq ++;
    						i++;
    					}
    					else
    					{
    						if(currentSeq > longestSeq)
    	        				longestSeq = currentSeq;
    	        			
    	        			isFinished2 = true;
    					}
    					
	    				numIndex ++;
    				}
    				
    				if(numIndex >= array2.length)
    					isFinished1 = true;
    			}
    		}
    	}
    	
    	return longestSeq;*/
    	 
    	 int max = 0;
    	 for(int seqStart = 0; seqStart < array1.length; seqStart++)
    	 {
    		 int seqEnd = seqStart;
    		 boolean inLoop = true;
    		 while(inLoop)
    		 {
	    		 int[] seq = getSequence(seqStart, seqEnd, array1);
	    		// ArrayPractice.print(seq);
	    		 if(checkSequence(seq, array2))
	    		 {
	    			 if(seq.length > max)
	    				 max = seq.length;
	    			 
	    			 if(seqEnd < array1.length)
	    				 seqEnd ++;
	    			 else
	    				 inLoop = false;
	    		 }
	    		 else
	    			 inLoop = false;
    		 }
    	 }
    	 
    	 return max;
>>>>>>> refs/remotes/origin/master
    }

    private static boolean checkSequence(int[] seq, int[] array2) {
		A:for(int i = 0; i < array2.length; i++)
			B:for(int j = 0; j < seq.length; j++)
				if((j+i) < array2.length && array2[j + i] != seq[j])
					break B;
				else if(j == seq.length-1)
					return true;
		
		return false;
	}
    //0,3,5,3,4
    //0,2
	private static int[] getSequence(int seqStart, int seqEnd, int[] array1) {
		
		int[] seq = new int[seqEnd - seqStart + 1];
		int j = 0;
		for(int i = seqStart; i <= seqEnd; i++)
		{
			seq[j] = array1[i];
			//j++;
			
			System.out.println(i);
		}
		return seq;
	}

	public static int[] generateDistinctItemsList(int n){
        /**
         * This method needs to generate an int[] of length n that contains distinct, random integers
         * between 1 and 2n 
         * The method will be tested by verifying that the array you return is n items long,
         * contains only entries between 1 and 2n (inclusive) and has no duplicates
         * 
         * */
        boolean isDuplicate = false;
    	int randNum = 0;
    	int[] newArray = new int[n];
    	for(int i = 0; i < n; i ++)
    	{
    		do
    		{
	    		randNum = (int)(Math.random() * 2 * n) + 1;
	    		
	    		isDuplicate = false;
	    		for(int j = 0; j < n; j ++)
	    			if(newArray[j] == randNum)
	    				isDuplicate = true;
	    		
    		}while(isDuplicate);
    		
    		newArray[i] = randNum;
    	}
        return newArray; 
    }
    
    
    public static void cycleThrough(int[] array, int n){
        /** This problem represents people moving through a line.
         * Once they get to the front of the line, they get what they've been waiting for, then they 
         * immediately go to the end of the line and "cycle through" again.
         * 
         * This method reorders the array so that it represents what the array would look like
         * after it had been cycled through an n number of times.
         * For example, cycleThrough({2,1,5,6}}, 1) after executing, array == {1,5,6,2} 
         * because '2' (the person at the front of the line) cycled through and is now at the end of the line
         * 
         * cycleThrough({3,7,4,2,8,6,2,9}}, 2) after executing, array == {4,2,8,6,2,9,3,7} 
         * because '3' and '7' (the TWO people at the front of the line) cycled through and are now at the end of the line
         * 
         * Likewise,
         * cycleThrough({3,7,4,2,8,6,2,9}}, 0) after executing, array == {3,7,4,2,8,6,2,9}  (no movement)
         * and the most interesting case, 
         * cycleThrough({3,7,4,2,8,6,2,9}}, 49) after executing, array == {7,4,2,8,6,2,9,3}  
         * Because after cycling through 49 times, everyone had a chance to go through 6 times, but '3'
         * was able to go through one more time than anyone else
         * 
         * CHALLENGE
         * For extra credit, make your method handle NEGATIVE n
         * */
         while(n > 0)
    	{
    		int first = array[0];
    		
    		for(int i = 0; i < array.length; i++)
    			if(i < array.length - 1)
    				array[i] = array[i + 1];
    		
    		array[array.length - 1] = first;
    		n --;
    	}
    }
    
    private static int indexOf(int[] array, int key, int start)
    {
    	for(int i = start; i < array.length; i++)
	    	if(array[i] == key)
	    		return i;
    	
    	return -1;
    }
    
    private static int indexOf(double[] array, double key, int start)
    {
    	for(int i = start; i < array.length; i++)
	    	if(array[i] == key)
	    		return i;
    	
    	return -1;
    }
    
    private static double[] getMinMax(double[] array)
    {
    	double[] minMax = new double[2];
    	double min = array[0];
    	double max = 0;
    	
    	for(int i = 0; i < array.length; i++)
    	{
    		if(max < array[i])
				max = array[i];
			
			if(min > array[i])
				min = array[i];
    	}
    	
    	minMax[0] = min;
    	minMax[1] = max;
    	
    	return minMax;
    }
    
<<<<<<< HEAD
    private static double[] excludeFromArray(double[] array, int exclude)
    {
    	double[] newArray = new double[array.length - 1];
    	int newIndex = 0;
    	
    	for(int i = 0; i < array.length; i++)
	    	if(i != exclude)
	    	{
	    		//System.out.println(newIndex + "");
	    		newArray[newIndex] = array[i];
	    		newIndex ++;
	    	}
    	
    	return newArray;
    }
}
=======
    private static double[] excludeFromArray(double[] array, double exclude)
    {
    	double[] newArray = new double[array.length - 1];
    	int newIndex = 0;
    	boolean isExcluded = false;
    	for(int i = 0; i < array.length; i++)
    		
    		if(array[i] == exclude && !isExcluded)
    			isExcluded = true;
    		else
	    		newArray[newIndex] = array[i];
    	
	    	newIndex ++;

    	
    	return newArray;
    }
}


/*
private static double[] excludeFromArray(double[] array, int exclude)
{
	double[] newArray = new double[array.length - 1];
	int newIndex = 0;
	
	for(int i = 0; i < array.length; i++)
    	if(i != exclude)
    	{
    		newArray[newIndex] = array[i];
    		newIndex ++;
    	}
	
	return newArray;
}

*
*
*while(array.length > 2)
	     {
	    	 int minIndex = indexOf(array, min, 0); 
	    	 array = excludeFromArray(array, minIndex);
	    	 int maxIndex = indexOf(array, max, 0);
	    	 array = excludeFromArray(array, maxIndex);
	    	 
	    	 double[] minMax = getMinMax(array);
	    	 min = minMax[0];
	    	 max = minMax[1];
	     }
*
*/
>>>>>>> refs/remotes/origin/master
