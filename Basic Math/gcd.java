//BIG O(LOG PHI)(MIN A,B))

class Solution {
    public int GCD(int n1, int n2)
   
     {
    while(n1>0 && n2>0)
    {
        if (n1>n2)
        {
          n1= n1%n2;
        }
        else
        n2=n2%n1;
    }
    if (n1==0)
    return n2;
    else 
    return n1;
    }
}
