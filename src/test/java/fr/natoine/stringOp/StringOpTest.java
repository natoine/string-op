package fr.natoine.stringOp;

import junit.framework.TestCase;

public class StringOpTest extends TestCase
{

	public StringOpTest(String name) 
	{
	    super(name);
	  }

	/**
	 * @param args
	 */
	public void testDeleteBlanks() 
	{
		String _test = " ";
		System.out.println("[StringOpTest.testDeleteBlanks] : " + StringOp.deleteBlanks(_test));
		_test = "test     ";
		System.out.println("[StringOpTest.testDeleteBlanks] : " + StringOp.deleteBlanks(_test));
		_test = "     test";
		System.out.println("[StringOpTest.testDeleteBlanks] : " + StringOp.deleteBlanks(_test));
		_test = "te    st";
		System.out.println("[StringOpTest.testDeleteBlanks] : " + StringOp.deleteBlanks(_test));
		_test = "  te   st   ";
		System.out.println("[StringOpTest.testDeleteBlanks] : " + StringOp.deleteBlanks(_test));
		_test = "";
		System.out.println("[StringOpTest.testDeleteBlanks] : " + StringOp.deleteBlanks(_test));
	}
	
	public void testIsNull()
	{
		String _test = null;
		if(StringOp.isNull(_test)) 
		{
			System.out.println("[StringOpTest.testIsNull] is null");
		}
		else System.out.println("[StringOpTest.testIsNull] " + _test + " is not null");
		_test = "";
		if(StringOp.isNull(_test)) 
		{
			System.out.println("[StringOpTest.testIsNull] is null");
		}
		else System.out.println("[StringOpTest.testIsNull] " + _test + " is not null");
		_test = "    ";
		if(StringOp.isNull(_test)) 
		{
			System.out.println("[StringOpTest.testIsNull] is null");
		}
		else System.out.println("[StringOpTest.testIsNull] " + _test + " is not null");
		_test = "test";
		if(StringOp.isNull(_test)) 
		{
			System.out.println("[StringOpTest.testIsNull] is null");
		}
		else System.out.println("[StringOpTest.testIsNull] " + _test + " is not null");
	}
	
	public void testIsValidMail()
	{
		String _mail_address = null;
		if(StringOp.isValidMail(_mail_address))
		{
			System.out.println("[StringOpTest.isValidMailTest] " + _mail_address + " is valid");
		}
		else
		{
			System.out.println("[StringOpTest.isValidMailTest] is not valid");
		}
		_mail_address = " ";
		if(StringOp.isValidMail(_mail_address))
		{
			System.out.println("[StringOpTest.isValidMailTest] " + _mail_address + " is valid");
		}
		else
		{
			System.out.println("[StringOpTest.isValidMailTest] is not valid");
		}
		_mail_address = "mailtest";
		if(StringOp.isValidMail(_mail_address))
		{
			System.out.println("[StringOpTest.isValidMailTest] " + _mail_address + " is valid");
		}
		else
		{
			System.out.println("[StringOpTest.isValidMailTest] is not valid");
		}
		_mail_address = "@mailTest.com";
		if(StringOp.isValidMail(_mail_address))
		{
			System.out.println("[StringOpTest.isValidMailTest] " + _mail_address + " is valid");
		}
		else
		{
			System.out.println("[StringOpTest.isValidMailTest] is not valid");
		}
		_mail_address = ".mailTest@com";
		if(StringOp.isValidMail(_mail_address))
		{
			System.out.println("[StringOpTest.isValidMailTest] " + _mail_address + " is valid");
		}
		else
		{
			System.out.println("[StringOpTest.isValidMailTest] is not valid");
		}
		_mail_address = "mail@Test.com";
		if(StringOp.isValidMail(_mail_address))
		{
			System.out.println("[StringOpTest.isValidMailTest] " + _mail_address + " is valid");
		}
		else
		{
			System.out.println("[StringOpTest.isValidMailTest] is not valid");
		}
		_mail_address = "antoineseilles@gmail.com";
		if(StringOp.isValidMail(_mail_address))
		{
			System.out.println("[StringOpTest.isValidMailTest] " + _mail_address + " is valid");
		}
		else
		{
			System.out.println("[StringOpTest.isValidMailTest] is not valid");
		}
		_mail_address = "antoine.seilles@gmail.com";
		if(StringOp.isValidMail(_mail_address))
		{
			System.out.println("[StringOpTest.isValidMailTest] " + _mail_address + " is valid");
		}
		else
		{
			System.out.println("[StringOpTest.isValidMailTest] is not valid");
		}
		_mail_address = "antoineseilles@gma.il.com";
		if(StringOp.isValidMail(_mail_address))
		{
			System.out.println("[StringOpTest.isValidMailTest] " + _mail_address + " is valid");
		}
		else
		{
			System.out.println("[StringOpTest.isValidMailTest] is not valid");
		}
		_mail_address = "antoi@neseilles@gmail.com";
		if(StringOp.isValidMail(_mail_address))
		{
			System.out.println("[StringOpTest.isValidMailTest] " + _mail_address + " is valid");
		}
		else
		{
			System.out.println("[StringOpTest.isValidMailTest] is not valid");
		}
	}
}
