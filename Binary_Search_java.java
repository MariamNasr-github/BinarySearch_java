
 public int binary_search(int[] data, int element)
    {
      int right = 0;
      int left = data.length- 1;

    while (right <= left)
    {
       int middle = (right + left)/2;
       
        if (data[middle] == element)
        {
            return middle;
        }
            
        else if (data[middle] > element)
        {
            left = middle - 1;
        }
            
        else
        {
             right = middle + 1;
        }
          
    }   
    return -1;
    }
