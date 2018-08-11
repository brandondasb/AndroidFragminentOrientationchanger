package com.example.dondon.androidfragminentorientationchanger;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentLandscape extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.landscape_fragment,container,
                false);
                //takes provided xlm layout we wanan use by pass it to inflate., pass in the container ( view that fragment can be attached to yes or no)
                //pass inflat based weather you wana attached the optional viewd named contained or not.
    }


}
