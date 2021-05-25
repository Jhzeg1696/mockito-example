package com.jhzeg.mocking;

public class DatabaseService {
	private Database database;
	
	public DatabaseService(Database database)
	{
		this.database = database;
	}
	
	public boolean query(String query)
	{
		return database.isReady();
	}
	
}
