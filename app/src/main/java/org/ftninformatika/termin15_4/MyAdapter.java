package org.ftninformatika.termin15_4;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    private Activity activity;
    private List<Person> data;

    public MyAdapter(Activity activity, List<Person> data) {
        this.activity = activity;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView=activity.getLayoutInflater().inflate((R.layout.my_single_item,null);
        }
        TextView tvName=convertView.findViewById(R.id.tvName);
        tvName.setText(data.get(position).getName());
        TextView tvDescription=convertView.findViewById((R.id.tvDescription));
        tvDescription.setText(data.get(position).getDescription());
        return convertView;
    }

}
