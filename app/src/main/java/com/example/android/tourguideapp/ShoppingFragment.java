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
 * Use the {@link ShoppingFragment#} factory method to
 * create an instance of this fragment.
 */
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // Create a list of attraction for the shopping scene
        final ArrayList<Attraction> places = new ArrayList<Attraction>();

        places.add(new Attraction("Marina Bay Sands", "Visit Singapore's best luxury destination for the world's largest rooftop Infinity Pool, award-winning dining, and a Casino.",
                R.drawable.mbs));
        places.add(new Attraction("VivoCity", "VivoCity is a large shopping mall located in the HarbourFront precinct of Bukit Merah, Singapore.",
                R.drawable.vivo_city));
        places.add(new Attraction("Jewel Changi Airport", "Jewel Changi Airport is a nature-themed retail complex surrounded by and linked to Changi Airport.",
                R.drawable.jewel));
        places.add(new Attraction("ION Orchard", "A shopping mall, next to Orchard MRT station. Luxurious and common-brands under one roof.",
                R.drawable.ion));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}