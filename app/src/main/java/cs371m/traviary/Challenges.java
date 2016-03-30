package cs371m.traviary;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by efosaelaiho on 3/25/16.
 */
public class Challenges extends Fragment {

    private TreeMap<String,Boolean> challenges;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.challenges,container,false);
        MainActivity mainActivity = (MainActivity)getActivity();
        challenges = mainActivity.getStates();
        return v;
    }
}