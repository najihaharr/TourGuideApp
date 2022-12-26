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
 * Use the {@link MuseumFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MuseumFragment extends Fragment {

    public MuseumFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // Create a list of attraction for the museums in SG
        final ArrayList<Attraction> places = new ArrayList<Attraction>();

        places.add(new Attraction("National Museum of Singapore", "The National Museum of Singapore is a public museum dedicated to Singaporean art, culture and history.",
                R.drawable.national_museum));
        places.add(new Attraction("ArtScience Museum", "ArtScience Museum is a museum within the integrated resort of Marina Bay Sands in the Downtown Core.",
                R.drawable.artscience));
        places.add(new Attraction("Asian Civilisations Museum", "The Asian Civilisations Museum is an institution which forms a part of the four museums in Singapore.",
                R.drawable.acm));
        places.add(new Attraction("Singapore Art Museum", "Home of Contemporary Art in Southeast Asia | Discover one of the world's most important collections of contemporary art by SG artists.",
                R.drawable.sam));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}