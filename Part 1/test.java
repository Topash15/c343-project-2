public class test
{
    public static void main(String[] args)
    {
		hashtable ht = new hashtable(3);
		ht.insert(2002, "First Last", 2.02);
		ht.insert(1001, "First Last", 1.01);
		ht.insert(3003, "First Last", 2.03);
		ht.insert(9009, "First Last", 6.03);
		ht.insert(4004, "First Last", 3.02);
		ht.insert(5005, "First Last", 3.03);
		ht.insert(8008, "First Last", 5.02);
		ht.insert(7007, "First Last", 4.03);
		ht.insert(9001, "First Last", 5.03);
		ht.insert(9005, "First Last", 6.02);
		ht.insert(9002, "First Last", 6.01);
		ht.insert(6006, "First Last", 4.02);
		ht.insert(1000, "First Last", 99.88);
		ht.insert(1002, "First Last", 1.02);
		ht.insert(1003, "First Last", 1.03);
		ht.insert(8000, "First Last", 5.01);
		ht.insert(7000, "First Last", 99.88);
		ht.insert(6000, "First Last", 4.01);
		ht.insert(5000, "First Last", 5.55);
		ht.insert(4000, "First Last", 3.01);
		ht.insert(2000, "First Last", 2.01);
		ht.insert(3000, "First Last", 5.55);

		ht.remove(5000, "First Last");
		ht.remove(1000, "First Last");
		ht.remove(7000, "First Last");
		ht.remove(3000, "First Last");

		for (int n = 1000; n<=9999; n++)
		{
			account a = ht.search(n, "First Last");
	
			if (a!=null) System.out.println("the balalnc of account " + n + " is $" + a.balance);
	    }
	}
}
/*
// if your hashtable is corrected implemented,
// you should see the following result:

the balalnc of account 1001 is $1.01
the balalnc of account 1002 is $1.02
the balalnc of account 1003 is $1.03
the balalnc of account 2000 is $2.01
the balalnc of account 2002 is $2.02
the balalnc of account 3003 is $2.03
the balalnc of account 4000 is $3.01
the balalnc of account 4004 is $3.02
the balalnc of account 5005 is $3.03
the balalnc of account 6000 is $4.01
the balalnc of account 6006 is $4.02
the balalnc of account 7007 is $4.03
the balalnc of account 8000 is $5.01
the balalnc of account 8008 is $5.02
the balalnc of account 9001 is $5.03
the balalnc of account 9002 is $6.01
the balalnc of account 9005 is $6.02
the balalnc of account 9009 is $6.03

*/
