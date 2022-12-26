package com.example.android.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TouristAttractionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TouristAttractionFragment extends Fragment {


    public TouristAttractionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // Create a list of attraction for the tourist attraction scene
        final ArrayList<Attraction> places = new ArrayList<Attraction>();

        places.add(new Attraction("Gardens By The Bay", "The Gardens by the Bay is a nature park spanning 101 hectares in the Central Region of Singapore.",
                R.drawable.gbtb));
        places.add(new Attraction("Universal Studios Singapore", "Universal Studios Singapore is a theme park located within the Resorts World Sentosa at Sentosa.",
                R.drawable.uss));
        places.add(new Attraction("Singapore Flyer", "The Singapore Flyer is an observation wheel at the Downtown Core district of Singapore.",
                R.drawable.singapore_flyer));
        places.add(new Attraction("Singapore River", "The Singapore River is a river that flows parallel to Alexandra Road and feeds into the Marina Reservoir.",
                R.drawable.singapore_river));
        places.add(new Attraction("Marina Barrage", "Marina Barrage is a dam in southern Singapore built at the confluence of five rivers.",
                R.drawable.marina_barrage));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}