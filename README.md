**PrefixSum and DiffSum**
**PrefixSum — used for range addition, subarray questions, etc.**

**Formula:**
ps[i+1] = ps[i] + arr[i]  {For 0 based indexing}


OR 
ps[i] = ps[i-1] + arr[i] {for 1 indexing}


****DiffSum** — used to calculate range update queries [l:r:v]****

**Formula:**
diff[l-1] += val; {For 0 based indexing}
if (r < n) 
diff[r] -= val;


OR

diff[l] += val; // FOR 1 based indexing
diff[r + 1] -= val;
PrefixSum — used for range addition, subarray questions, etc.
