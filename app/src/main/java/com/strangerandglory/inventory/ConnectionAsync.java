package com.strangerandglory.inventory;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by m on 2016-11-06.
 */

public class ConnectionAsync extends AsyncTask<Void, Void, Void> {

    private ArrayList<Item> items;
    private ArrayList<Category> categories;
    private ArrayList<BrandName> brands;
    private ItemAdapter adapter;

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
        String url = "https://test-53fc.restdb.io/rest/items";
        String key = "131fd63b6484fe4fc1fb32ef4c206d34887ef";

        URL obj = null;
        try {
            obj = new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        HttpURLConnection con = null;
        try {
            con = (HttpURLConnection) obj.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // optional default is GET
        try {
            con.setRequestMethod("GET");
        } catch (ProtocolException e) {
            e.printStackTrace();
        }

        //add request header
        con.setRequestProperty("x-apikey", key);

        int responseCode = 0;
        try {
            responseCode = con.getResponseCode();
        } catch (IOException e) {
            e.printStackTrace();
            e.getMessage();
        }
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = null;
        try {
            in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String inputLine;
        StringBuffer response = new StringBuffer();

        try {
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //print result
        System.out.println(response.toString());
        

        return null;
    }


}

