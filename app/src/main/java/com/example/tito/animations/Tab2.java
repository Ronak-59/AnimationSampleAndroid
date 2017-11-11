package com.example.tito.animations;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.twotoasters.jazzylistview.JazzyListView;

import java.util.ArrayList;



public class Tab2 extends Fragment {
    private JazzyListView lvData;
    private DataDTO dataDTO;
    private ArrayList listData = new ArrayList();
    private ApderData apderData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab2, container, false);

        lvData = (JazzyListView)rootView.findViewById(R.id.lv_data_animation);
        // add data demo
        for (int i = 0; i < 40; i++) {

            dataDTO = new DataDTO();
            dataDTO.setName("Scroll Me Slow & Fast");
            listData.add(dataDTO);
        }

        // add data to apter
        apderData = new ApderData(getActivity(), listData);
        lvData.setAdapter(apderData);

        return rootView;
    }

}
