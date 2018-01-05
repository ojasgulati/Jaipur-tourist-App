package com.example.bittu.jaipur;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.jaipur_list, container, false);
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.jas_title),getString(R.string.hotel_antities), R.drawable.hotels_jas_vilas));
        places.add(new Place(getString(R.string.rambagh_title),getString(R.string.hotel_antities), R.drawable.hotel_rambagh));
        places.add(new Place(getString(R.string.heritage_title),getString(R.string.hotel_antities), R.drawable.hotel_heritage));
        places.add(new Place(getString(R.string.oberio_title),getString(R.string.hotel_antities), R.drawable.hotel_oberoi));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView list = (ListView)rootView.findViewById(R.id.list);

        list.setAdapter(adapter);
        return rootView;
    }
}
