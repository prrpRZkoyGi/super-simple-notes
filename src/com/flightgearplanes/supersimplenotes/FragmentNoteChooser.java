package com.flightgearplanes.supersimplenotes;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentNoteChooser extends Fragment {

	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, 
        Bundle savedInstanceState) {
		// Inflate the fragment
		View V = inflater.inflate(R.layout.fragment_note_chooser, container, false);

		
        // Return the inflated view
		return V;
        
    }
}