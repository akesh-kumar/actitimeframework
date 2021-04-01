package org.test;



import org.generics.BaseTest;
import org.pom.Actitime_Homepage;
import org.pom.New_Leave;
import org.pom.Types_Leave;
import org.testng.annotations.Test;




public class ActiLogPage extends BaseTest
{

	@Test
	public void setting()
	{
	Actitime_Homepage set=new Actitime_Homepage(driver);
		set.settingMethod();
		Types_Leave click2=new Types_Leave(driver);
		  click2. typesofleave();
		  
		  Types_Leave click3=new Types_Leave(driver);
		         click3.creatleavetype();
		         New_Leave click4=new New_Leave(driver);
		        		 click4.createNewLeaveMethod();
		        		 System.out.println("created");
	}

}
