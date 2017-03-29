package com.example.cis.mnmv2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ckling on 3/29/17.
 */

public class CharacterCreationFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater li, ViewGroup vg, Bundle b) {
        super.onCreateView(li, vg, b);
        View rootView = li.inflate(R.layout.fragment_character_creator, vg, false);

        return rootView;
    }
}
