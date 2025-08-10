

**PrefixSum** - used for range addition, subarray questions etc.
formula - ps[i+1] = ps[i] + arr[i]   {Considering 0th index to avoid l==0}



**DiffSum** - used to calculate range updates queries [l:r:v]
formula =  diff[l-1] += val;  {For 0 based indexing]
            if (r < n) {
                diff[r] -= val;


          OR
diff[l] += val;        //FOR 1 based indexing
diff[r + 1] -= val;   
