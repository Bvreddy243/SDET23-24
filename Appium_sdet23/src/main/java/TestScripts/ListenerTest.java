package TestScripts;

import org.testng.annotations.Test;
import org.junit.Assert;
import org.testng.annotations.Listeners;


import com.ecom.appium.Genericutils.BaseClass;
@Listeners(com.ecom.appium.Genericutils.ListenerImpl.class)
public class ListenerTest extends BaseClass {


@Test
	public void Listenertest() {
	System.out.println("test script failed");
	Assert.fail();
	driver.close();
	}
	}
