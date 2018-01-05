package com.example.bittu.jaipur;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class TemplesFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.jaipur_list, container, false);
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.akshardham_title),getString(R.string.akshardham), R.drawable.temple_akshardham));
        places.add(new Place(getString(R.string.digamber_title),getString(R.string.digamber),  R.drawable.temple_jain_mandir));
        places.add(new Place(getString(R.string.goving_title),getString(R.string.govind), R.drawable.temple_govind_devji));
        places.add(new Place(getString(R.string.lakshmi_title),getString(R.string.lakshmu), R.drawable.temple_lakshmi));
        places.add(new Place(getString(R.string.moti_title),getString(R.string.moti), R.drawable.temple_moti));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView list = (ListView)rootView.findViewById(R.id.list);

        list.setAdapter(adapter);
        return rootView;
    }
}
