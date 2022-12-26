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
 * Use the {@link LocalFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LocalFragment extends Fragment {

    public LocalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // Create a list of attraction for the Local scene
        final ArrayList<Attraction> places = new ArrayList<Attraction>();

        places.add(new Attraction("Haji Lane", "Possibly the narrowest street in Singapore, this back alley is filled with little cafes, cool bars, fascinating graffiti walls.",
                R.drawable.haji_lane));
        places.add(new Attraction("Chinatown", "Chinatown's maze of narrow roads includes Chinatown Food Street, with its restaurants serving traditional fare.",
                R.drawable.chinatown));
        places.add(new Attraction("Little India", "Little India is a vibrant cultural enclave with temples and mosques, street art and brightly painted shophouses.",
                R.drawable.little_india));
        places.add(new Attraction("Kampong Glam", "Centred on busy Arab Street, Kampong Glam is known as Singapore’s Muslim Quarter.",
                R.drawable.kampong_glam));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}