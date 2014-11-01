package com.teamtreehouse.ribbit;

import android.app.Application;


import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.PushService;
import com.teamtreehouse.ribbit.com.teamtreehouse.ribbit.ui.MainActivity;
import com.teamtreehouse.ribbit.com.teamtreehouse.ribbit.utils.ParseConstants;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
	    Parse.initialize(this,
                "ugvYQBY9jyQYtUt0NHyMnPxqJjb5bzPtkBVyKJd1",
                "B22JHeyItOl71u7eE5kXv65N8C5c1O0CVk2HrePf");
        PushService.setDefaultPushCallback(this, MainActivity.class);
	}

    public static void updateParseInstallation(ParseUser user) {
        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.put(ParseConstants.KEY_USER_ID, user.getObjectId());
        installation.saveInBackground();
    }
}
