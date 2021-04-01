package org.test;

import org.generics.BaseTest;
import org.pom.Actitime_Homepage;
import org.pom.CreatNewWork;
import org.pom.CreatNewWorklocation;
import org.pom.Types_Leave;
import org.testng.annotations.Test;

public class Types_ofWork  extends BaseTest
{

	@Test
	public void setting() throws InterruptedException 
	{
		Actitime_Homepage set=new Actitime_Homepage(driver);
		set.settingMethod();
		Types_Leave click5=new Types_Leave(driver);
		  click5.typesofwork();
		  CreatNewWorklocation click1=new CreatNewWorklocation(driver); 
		  click1.createTypesofworkMethod(); 
		  CreatNewWork click3=new CreatNewWork(driver);
				  click3.createNewWorkMethod();
		  

}
}
