package com.example.bittu.jaipur;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricalFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.jaipur_list,container,false);
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.amber_ttile),getString(R.string.amber) , R.drawable.historical_amber));
        places.add(new Place(getString(R.string.hawa_title),getString(R.string.hawa), R.drawable.historical_hawa));
        places.add(new Place(getString(R.string.jaigarh_title),getString(R.string.jaigarh), R.drawable.historical_jaigarh));
        places.add(new Place(getString(R.string.city_palace_title),getString(R.string.city_palace), R.drawable.historical_cityplace));
        places.add(new Place(getString(R.string.jantar_title),getString(R.string.jantar) , R.drawable.historical_jantar));
        places.add(new Place(getString(R.string.jal_mahal_title),getString(R.string.jal_mahal) , R.drawable.historical_jalmahal));
        places.add(new Place(getString(R.string.narghar_title),getString(R.string.nargahar), R.drawable.historical_naharghar));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView list = (ListView)rootView.findViewById(R.id.list);

        list.setAdapter(adapter);
        return rootView;
    }
}
