package com.doosoon.home.bluema;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by doosoon on 2016-08-12.
 */
public class CityListAdapter extends BaseAdapter {

    private Context mContext;
    private DataManager mDataManager = new DataManager();

    public CityListAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return mDataManager.getCityCount();
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CityListItemView itemView = new CityListItemView(mContext,mDataManager.getCityData(position));
        return itemView;

    }
}
