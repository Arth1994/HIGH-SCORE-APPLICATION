package com.example.arth.axs175430_asg5;import android.content.Context;import android.support.annotation.NonNull;import android.view.LayoutInflater;import android.view.View;import android.view.ViewGroup;import android.widget.ArrayAdapter;import android.widget.TextView;import java.util.ArrayList;import java.util.List;public class HighScoreAdapter extends ArrayAdapter<ScoreModel> {    private static final String TAG = "HighScoreAdapter";    private Context context;    int resource;    public HighScoreAdapter(Context context, int resource, ArrayList<ScoreModel> objects) {        super(context, resource, objects);        this.context = context;        this.resource = resource;    }    @NonNull    @Override    public View getView(int position,  View convertView,  ViewGroup parent) {        String name = getItem(position).getPlayerName();        String date = getItem(position).getCurrDate();        String time = getItem(position).getCurrTime();        String score = getItem(position).getPlayerScore();        ScoreModel scoreModel = new ScoreModel(name, date, time, score);        LayoutInflater inflater = LayoutInflater.from(context);        convertView = inflater.inflate(resource, parent, false);        TextView t1 = (TextView)convertView.findViewById(R.id.player_name);        TextView t2 = (TextView)convertView.findViewById(R.id.current_date);        TextView t3 = (TextView)convertView.findViewById(R.id.current_time);        TextView t4 = (TextView)convertView.findViewById(R.id.player_score);        t1.setText(name);        t2.setText(date);        t3.setText(time);        t4.setText(score);        return  convertView;    }}