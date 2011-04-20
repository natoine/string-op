/*
 * Copyright 2010 Antoine Seilles (Natoine)
 *   This file is part of string-op.

    model-resource is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    model-resource is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with string-op.  If not, see <http://www.gnu.org/licenses/>.

 */
package fr.natoine.stringOp;

import java.net.URI;
import java.net.URISyntaxException;

public class StringOp 
{
	/**
	 * Deletes all the Blank to the begining or to the end of the parameter.
	 * @param _to_process the String to clean
	 * @return Clean String
	 */
	public static String deleteBlanks(String _to_process)
	{
		while(_to_process.startsWith(" "))
		{
			_to_process = _to_process.replaceFirst(" ", "");
		}
		while(_to_process.endsWith(" "))
		{
			_to_process = _to_process.substring(0, _to_process.length()-1);
		}
		return _to_process;
	}
	
	/**
	 * Tests if a String is null or made of blanks only or of length = 0.
	 * @param _to_test the String to test
	 * @return true if the String is null or contains only blanks.
	 */
	public static boolean isNull(String _to_test)
	{
		
		if(_to_test == null || _to_test.isEmpty() || deleteBlanks(_to_test).length() == 0) return true ;
		else return false ;
	}
	
	/**
	 * Tests if a String is a valid Mail address Syntax
	 * @param _mail_to_test
	 * @return true is the String is a valid mail address Syntax
	 */
	public static boolean isValidMail(String _mail_to_test)
	{
		if(!isNull(_mail_to_test) && !_mail_to_test.startsWith(" ") && !_mail_to_test.endsWith(" "))
		{
			if(_mail_to_test.contains("@") && _mail_to_test.contains(".") )
			{
				if(!_mail_to_test.startsWith("@") && _mail_to_test.indexOf("@") == _mail_to_test.lastIndexOf("@"))
				{
					if(!_mail_to_test.endsWith(".")) return true;
					else return false ;
				}
				else return false ;
			}
			else return false ;
		}
		else return false ;
	}
	/**
	 * Tests if a String is a valid URI syntax
	 * @param uri
	 * @return
	 */
	public static boolean isValidURI(String uri)
	{
		if(uri == null || uri.isEmpty()) return false ;
		if(!uri.startsWith("http://")) return false ;
		try {
			new URI(uri);
			return true;
		} catch (URISyntaxException e) {
			System.out.println("[StringOp.isValidURI] not a valid URI : " + uri);
			e.printStackTrace();
			return false ;
		}
	}
}
