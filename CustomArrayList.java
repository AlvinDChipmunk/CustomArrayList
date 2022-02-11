package com.coderscampus.assignment5.customarraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object [] items          = new Object [10];
	Integer  currentSize    = 0;
	Integer  currentMaxSize = 10;
	private T t;

	@Override
	public boolean add ( T item ) {
	
		if ( item == null ) return false;
		
		Integer whereToAdd = 0;

		if ( qNeedToGrow() ) growArrayList(); // pre insertion size check, grow if needed
		
		while ( items[whereToAdd] != null ) whereToAdd ++;
		
		items[whereToAdd] = item; 
		if ( qNeedToGrow() ) growArrayList(); // post insertion size check, grow if needed	
		return true;

	}

	@Override
	public int getSize () {
		
		Integer sizeCount = 0;

		if ( qNeedToGrow() ) growArrayList();
		
		 for (Object myItem : items) { if (myItem != null) sizeCount ++;}
		
		this.currentSize = sizeCount;
		
		if ( qNeedToGrow() ) growArrayList();
		
		return ( ( sizeCount >= 1 )?( sizeCount ):( 0 ) );
	}

	@Override
	public T get ( int index ) {

		if ( index >= currentSize ) {
			return null;
		}
		else {
			t = (T) this.items[index];
			return t;
		}
	}
	
	private boolean qNeedToGrow () {
		return ( ( currentSize >=  currentMaxSize)?( true ):( false ) );
	}
	
	private void growArrayList () {
	
		this.currentMaxSize *= 2;
		
		Object[] newArrayList = new Object[currentMaxSize];
		
		for ( int i = 0; i < this.currentSize ; i ++ ) { newArrayList[i] = this.items[i]; }
	
		this.items = newArrayList;
	}
	
}
