package com.example.lucas.tarea2;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by lucas on 27/3/2017.
 */

public class FragmentMostrar extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view ;
        view = inflater.inflate(R.layout.fragmen_mostrar,container);
        return view;
    }

}
