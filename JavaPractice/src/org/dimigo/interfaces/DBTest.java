package org.dimigo.interfaces;

public class DBTest {

	public static void main(String[] args) {
		
		System.out.println("<<���� ��>>");
		IDBManager db = IDBManager.getDBObject(IDBManager.SYBASE_DATABASE);
		crud(db);
		
		System.out.println("<<���� ��>>");
		db = IDBManager.getDBObject(IDBManager.ORACLE_DATABASE);
		crud(db);
	}
	
	private static void crud(IDBManager db){
		db.insert();
		db.search();
		db.update();
		db.delete();
		System.out.println();
	}

}
