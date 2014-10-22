package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
	    Parse.initialize(this, 
	    	"ugvYQBY9jyQYtUt0NHyMnPxqJjb5bzPtkBVyKJd1", 
	    	"B22JHeyItOl71u7eE5kXv65N8C5c1O0CVk2HrePf");
	}
}
