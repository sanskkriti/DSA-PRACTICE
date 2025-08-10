**PrefixSum and DiffSum**
**PrefixSum — used for range addition, subarray questions, etc.**

formula —
ps[i+1] = ps[i] + arr[i]
{Considering 0th index to avoid l == 0}

ps[i] = ps[i-1] + arr[i] {for 1 indexing}


**DiffSum** — used to calculate range update queries [l:r:v]**

formula =
diff[l-1] += val; {For 0 based indexing}
if (r < n) {
    diff[r] -= val;
}

OR

diff[l] += val; // FOR 1 based indexing
diff[r + 1] -= val;
PrefixSum — used for range addition, subarray questions, etc.

formula —
ps[i+1] = ps[i] + arr[i]
{Considering 0th index to avoid l == 0}

DiffSum — used to calculate range update queries [l:r:v]

formula =
diff[l-1] += val; {For 0 based indexing}
if (r < n) {
    diff[r] -= val;
}

OR

diff[l] += val; // FOR 1 based indexing
diff[r + 1] -= val;
