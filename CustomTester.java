/*

<-----------------------------< Project installation notes!! >----------------------------->

This assignment project needs to be run in the following manner:

1. In one project, the com.coderscampus.assignment5 package and the 
com.coderscampus.assignment5.customarraylist package are inside the same source folder 
(probably named "src").

2. The two files, CustomList.java and CustomArrayList.java, are in the 
com.coderscampus.assignment5.customarraylist package.

3. The main testing file, CustomTester.java, is in the com.coderscampus.assignment5 package.

4.  If these packages and associated files are in their proper places, this should be able 
to run and execute the testing code.

5.  Possible debugging idea:  Make a new project and make inside the src folder if using 
Eclipse two packages, as named above.  Inside each package, create the appropriately named 
files or file, and copy and paste the source code from here in GitHub into the destination 
of those three newly created files correspondingly.

*/

package com.coderscampus.assignment5;

import com.coderscampus.assignment5.customarraylist.*;

public class CustomTester {

	public static void main(String[] args) {

		CustomList<String> myCustomList = new CustomArrayList<>();
		
		String tmpString = "";
		
		System.out.println( "Adding first ten items..." );
		// first add ten elements to an empty list
		for (int i = 0; i < 10; i++) {
			tmpString = "item " + i;
			myCustomList.add(tmpString);
			System.out.println( "Adding item \"" + tmpString + "\"" );
		}
		
		// now verifying that the ten are there
		for (int i=0; i<myCustomList.getSize(); i++) {
		    System.out.println(myCustomList.get(i));
		}

		// line break for group
		System.out.println("---------------------");
		System.out.println( "Adding second ten items..." );

		// now add ten more elements to a list of 10
		for (int i = 10; i < 20; i++) {
			tmpString = "item " + i;
			myCustomList.add(tmpString);
			System.out.println( "Adding item \"" + tmpString + "\"" );
		}
		
		// now verifying that twenty items are there
		for (int i=0; i<myCustomList.getSize(); i++) {
		    System.out.println(myCustomList.get(i));
		}

		// line break for group
		System.out.println("---------------------");

		System.out.println( "Adding third ten items..." );
		// now add ten more elements to a list of 20
		for (int i = 20; i < 30; i++) {
			tmpString = "item " + i;
			myCustomList.add(tmpString);
			System.out.println( "Adding item \"" + tmpString + "\"" );
		}
		
		// now verifying that thirty items are there
		for (int i=0; i<myCustomList.getSize(); i++) {
		    System.out.println(myCustomList.get(i));
		}

		// line break for group
		System.out.println("---------------------");
		
		System.out.println( "Adding fourth ten items..." );
		// now add ten more elements to a list of 30
		for (int i = 30; i < 40; i++) {
			tmpString = "item " + i;
			myCustomList.add(tmpString);
			System.out.println( "Adding item \"" + tmpString + "\"" );
		}
		
		// now verifying that fourty items are there
		for (int i=0; i<myCustomList.getSize(); i++) {
		    System.out.println(myCustomList.get(i));
		}

		// finishing line
		System.out.println("---------End Test------------");
		
	}

}
