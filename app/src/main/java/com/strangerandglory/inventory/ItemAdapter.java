package com.strangerandglory.inventory;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static android.text.Html.fromHtml;

/**
 * Created by m on 2016-10-31.
 */

public class ItemAdapter extends ArrayAdapter<Item> {
        private ArrayList<Item> items;
        private Activity activity;

        public ItemAdapter(Context context, Activity activity, int textViewResourceId, ArrayList<Item> items) {
            super(context, textViewResourceId, items);
            this.activity = activity;
            this.items = items;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View v = convertView;
            if (v == null) {
                LayoutInflater vi = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                v = vi.inflate(R.layout.list_item, null);
            }

            //+1 to remove the first empty title and description
            Item rf = items.get(position+1) ;
            if (rf != null) {
                TextView tt = (TextView) v.findViewById(R.id.toptext);
                TextView bb = (TextView) v.findViewById(R.id.bottomtext);
                TextView link = (TextView) v.findViewById(R.id.pubdate);

                if (tt != null) {
                    tt.setText(rf.getName());

                }
                if (bb != null) {
                    bb.setText(removeHTML(rf.getCategoryName()));
                }
                if (link != null) {
                    link.setText(rf.getBrandName());
                }
            }
            return v;

        }


        public ArrayList<String> makeRssFeed(String title, String description, String link) {
            return null;
        }

        public String removeHTML(String html) {
            return fromHtml(html).toString();
        }
    }

