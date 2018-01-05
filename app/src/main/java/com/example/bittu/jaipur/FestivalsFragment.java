package com.example.bittu.jaipur;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FestivalsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.jaipur_list, container, false);
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.duhlandi_title),getString(R.string.dhulandi), R.drawable.festival_dhulandi));
        places.add(new Place(getString(R.string.ganguar_title),getString(R.string.gangaur), R.drawable.festival_gangaur));
        places.add(new Place(getString(R.string.sankarat_title),getString(R.string.sankarat), R.drawable.festival_kite));
        places.add(new Place(getString(R.string.teej_title),getString(R.string.teej), R.drawable.festival_teej));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView list = (ListView)rootView.findViewById(R.id.list);

        list.setAdapter(adapter);


        return rootView;
    }

}
