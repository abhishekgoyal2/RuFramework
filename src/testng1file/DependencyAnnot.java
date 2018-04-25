package testng1file;

import java.io.IOException;

import org.testng.annotations.Test;

public class DependencyAnnot extends TestBase{

@Test
public void OpeningBrowser() throws IOException, InterruptedException
{
	
	TestBase tb=new TestBase();
	tb.Login();
//Login();
	System.out.println("Executing the opened Browser");
}


}