package com.gflux.missionatlantis.test;

import com.gflux.missionatlantis.model.activity.ActivityCollection;

import android.test.AndroidTestCase;

public class ActivityCollectionTest extends AndroidTestCase {
	
	private ActivityCollection collection;

	public ActivityCollectionTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see android.test.AndroidTestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		collection = new ActivityCollection(getContext());
		
	}

	/* (non-Javadoc)
	 * @see android.test.AndroidTestCase#tearDown()
	 */
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}
	
	public void emptySerializeTest(){
		collection.save();
		ActivityCollection collection 2 = new ActivityCollection(getContext());
		}
	
	

}
