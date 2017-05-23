package com.example.android.booklistingapp;

/**
 * Created by XY on 21.5.2017.
 */

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static android.graphics.Color.rgb;


public class BookAdapter extends ArrayAdapter<Book> {


    public BookAdapter(Context context, List<Book> books) {
        super(context, 0, books);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.book_list_item, parent, false);
        }


        Book currentBook = getItem(position);

        String title = currentBook.getTitle();

        TextView titleView = (TextView) listItemView.findViewById(R.id.title);

        titleView.setText(title);

        String author = currentBook.getAuthor();

        TextView authorView = (TextView) listItemView.findViewById(R.id.author);

        authorView.setText(author);

        authorView.setTextColor(Color.parseColor("#303F9F"));

        return listItemView;
    }
}