package com.cyient.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviderUtils 
{

	@DataProvider
	public Object [][] NewUserExcelData() throws IOException
	{
		Object[][] main= ExcelUtils.getSheetIntoObjectArray("src/test/resources/testdata/Starbucks.xlsx", "NewUserData");
		return main;
		
	}

}
