package com.android.coding_test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


public class CustomAdapter extends ArrayAdapter<CustomItem> {

    public CustomAdapter(@NonNull Context context, ArrayList<CustomItem> customList) {
        super(context, 0, customList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.custom_spinner, parent, false);

        }
        CustomItem item = getItem(position);
        ImageView spinnerI = convertView.findViewById(R.id.ivSpinnerLayout);
        TextView spinnerT = convertView.findViewById(R.id.tvSpinnerLayout);
        if (item != null) {
            spinnerI.setImageResource(item.getSpinnerImg());
            spinnerT.setText(item.getSpinnerName());
        }
        return convertView;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.drop_down_item, parent, false);

        }
        CustomItem item = getItem(position);
        ImageView dropdownI = convertView.findViewById(R.id.ivDropDownLayout);
        TextView dropdownT = convertView.findViewById(R.id.tvDropDownLayout);
        if (item != null) {
            dropdownI.setImageResource(item.getSpinnerImg());
            dropdownT.setText(item.getSpinnerName());
        }
        return convertView;
    }
}
