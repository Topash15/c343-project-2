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
		array[i] = null; //create empty linkedlists
	}
    }
	
    public void insert(int act, String n, double b)
    {        
        account temp = new account(act, n, b);
	int index = hash_code_map(act, n)%size;
	
	if(array[index] == null)
	{
            array[index] = temp;
	}
	else
	{
            temp.next = array[index];
            array[index] = temp;
	}
    }
    
    public void remove(int act, String n)
    {
	// your code goes here
	// find the account and remove it from the hashtable.
	// do nothing if it can not be found


    }
	
    public account search(int act, String name)
    {
	// your code goes here
	// find the account and return it (the pointer).
	// retun null if it can not be found


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
}












