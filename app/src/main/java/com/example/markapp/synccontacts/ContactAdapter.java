package com.example.markapp.synccontacts;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends ArrayAdapter<Contact> {

    public ContactAdapter(@NonNull Context context, List<Contact> contacts) {
        super(context, 0, contacts);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Contact currentContact = getItem(position);

        TextView nameView = listItemView.findViewById(R.id.list_name);
        nameView.setText(currentContact.getName());

        TextView phonenumberView = listItemView.findViewById(R.id.list_phonenumber);
        phonenumberView.setText(String.valueOf(currentContact.getPhonenumber()));

        TextView birthdayView = listItemView.findViewById(R.id.list_birthday);
        birthdayView.setText(currentContact.getBirthday());

        return listItemView;
    }
}
