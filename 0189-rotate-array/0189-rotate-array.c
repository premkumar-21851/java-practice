
void rotate(int* nums, int numsSize, int k)
{
    k=k%numsSize;
    
    if(k==0)
    {
        return ;
    }
      int array[k];
    
    int j = 0;

    // Store the last k elements
    for(int i = numsSize - k; i < numsSize; i++)
    {
        array[j] = nums[i];
        j++;
    }

    // Shift remaining elements to the right
    for(int i = numsSize - 1; i >= k; i--)
    {
        nums[i] = nums[i-k];
    }

    // Copy stored elements to the beginning
    for(int i = 0; i < k; i++)
    {
        nums[i] = array[i];
    }
}
