package com.strangerandglory.inventory;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/**
 * Created by m on 2016-11-09.
 */

public class DatabaseConnection {

    private String url = "https://test-53fc.restdb.io/rest/items?max=1";
    private String key = "131fd63b6484fe4fc1fb32ef4c206d34887ef";


    public DatabaseConnection(){}

    public void connect(String url, String requestMethod) {

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
            con.setRequestMethod(requestMethod);
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



        try {

            JSONArray jObject = new JSONArray(response.toString());
            JSONObject singleProd = jObject.getJSONObject(0);

            JSONArray brandNameArray = singleProd.getJSONArray("item_brand_name");
            JSONObject brandNameobj = brandNameArray.getJSONObject(0);

            JSONArray categoryArray = singleProd.getJSONArray("item_category_name");
            JSONObject categoryobj = categoryArray.getJSONObject(0);

            JSONArray attributeArray = singleProd.getJSONArray("item_attribute_type");
            JSONObject attributeObj = attributeArray.getJSONObject(0);

            //JSONArray photoArray = singleProd.getJSONArray("item_photo");
            //JSONObject photoObj = photoArray.getJSONObject(0);

            String name = singleProd.getString("item_name");
            double price = Double.parseDouble(singleProd.getString("item_price"));
            String attributeType = attributeObj.getString("attribute_type");
            double attributeAmount = Double.parseDouble(singleProd.getString("item_attribute_amount"));
            //String photo = photoObj.getString("item_photo");
            String brandName = brandNameobj.getString("brand_name");
            String category = categoryobj.getString("category_name");
            int quantity = Integer.parseInt(singleProd.getString("item_quantity"));
            int optimumQuantity = Integer.parseInt(singleProd.getString("item_optimum_quantity"));
            int safeQuantity = Integer.parseInt(singleProd.getString("item_safe_quantity"));




            Item item = new Item(name, price, attributeAmount, attributeType, "photo!", brandName, category,
                    quantity, optimumQuantity, safeQuantity);


            Log.d("Item Name", item.getItem_name());
            Log.d("Item Name", item.getItem_brand_name());
            Log.d("Item Name", item.getItem_category_name());
            Log.d("Item Name", String.valueOf(item.getItem_price()));
        } catch (Exception e) {
            e.printStackTrace();
        }






    }
}
