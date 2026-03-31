public class hashtable
{
    private account[] array;
    private int size;

    public hashtable(int n)
    {      
        size = getPrime(n);
	array = new account[size];
	for (int i=0; i<size; i++)
	{
            array[i] = null; // create empty trees
	}
    }
	
    public void insert(int act, String n, double b)
    {        
        account temp = new account(act, n, b);
	int index = hash_code_map(act, n)%size;
	
	array[index] = insert_to_subtree(array[index], temp);
    }
    
    // find the account and remove it from the hashtable.
    public void remove(int act, String name)
    {
	// your code goes here
        // 1. determine array index based on account number act
        //    and name
        // 2. call method remove_from_subtree() to remove account act from 
        //    binary search tree array[index]
        
    }
    
    private account remove_from_subtree(int act, account t)
    {
        // your code goes here
        // remove account that has account number act
        // from subtree t.
        
    }
	
    // this method should be called by remove_from_subtree()
    private account findMin(account t)
    {
        if(t==null) return null;
	else
	{
            if(t.left == null) return t;
            else return findMin(t.left);
	}
    }

	
    // search the account and return it
    public account search(int act, String name)
    {
	// your code goes here
        // 1. determine array index based on account number act
        //    and name
        // 2. call method search_subtree() to search account act from 
        //    binary search tree array[index] 
    }
    
    private account search_subtree(account t, int act)
    {
        // your code goes here
        // search and return an account that has account number act
        // from subtree t; return null if account can not be found
    
    }
    
    private int getPrime(int n)
    {        
        boolean done=false;
	int i = n+1;

	while(done==false)
	{
		boolean prime = true;
		for(int j=2; j<i; j++)
		{
			if(i%j==0) prime=false;
		}
		if(prime==true)
		{
			done = true;
		}
		else i = i + 1;
	}

	return i;
    }
    
    private int hash_code_map(int act, String name)
    {
    	int sum = 0;
	for(int i=0; i!=name.length(); i++)
	{
            sum = sum + (int)(name.charAt(i));
            //sum = sum + name.charAt(i); // this also works
	}
	return sum+act;
    }
    
    // insert new account n into subtree r based on account number
    private account insert_to_subtree(account r, account n)
    {
        if(r==null)
        {
            r = n;
        }
        else if(n.account_number < r.account_number)
        {
            r.left = insert_to_subtree(r.left, n);
        }
        else if(n.account_number > r.account_number)
        {
            r.right = insert_to_subtree(r.right, n);
        }
        
        return r;
    }
}












