package com.example.tito.animations;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;



public class ApderData extends ArrayAdapter {

    private static class ViewHolder {
        public final LinearLayout ll_item_list;
        public final TextView tvName;

        private ViewHolder(LinearLayout ll_item_list, TextView tvName) {
            this.ll_item_list = ll_item_list;
            this.tvName = tvName;
        }

        public static ViewHolder create(LinearLayout ll_item_list) {
            TextView tvName = (TextView) ll_item_list.findViewById(R.id.tv_name);
            return new ViewHolder(ll_item_list, tvName);
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder vh;
        if (convertView == null) {
            View view = mInflater.inflate(R.layout.item_listview, parent, false);
            vh = ViewHolder.create((LinearLayout) view);
            view.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }

        DataDTO item = (DataDTO) getItem(position);

        // todo code add data here
        vh.tvName.setText(item.getName());
        vh.tvName.setElevation(20);

        return vh.ll_item_list;
    }

    private LayoutInflater mInflater;

    // Constructors
    public ApderData(Context context, List objects) {
        super(context, 0, objects);
        this.mInflater = LayoutInflater.from(context);
    }

    public ApderData(Context context, DataDTO[] objects) {
        super(context, 0, objects);
        this.mInflater = LayoutInflater.from(context);
    }
}

