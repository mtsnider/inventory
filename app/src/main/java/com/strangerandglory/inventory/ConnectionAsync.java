package com.strangerandglory.inventory;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;

/**
 * Created by m on 2016-11-06.
 */

public class ConnectionAsync extends AsyncTask<Void, Void, Void> {
    private Context context;
    private Activity activity;
    private String restURL;
    private ListView listView;

    public ConnectionAsync(Context context, Activity activity, String restURL){
        this.context = context;
        this.activity = activity;
        this.restURL = restURL;
    }

    @Override
    protected Void doInBackground(Void... params) {
        DatabaseConnection db = new DatabaseConnection();
        db.connect("https://test-53fc.restdb.io/rest/items", "GET");


        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

    }
}

