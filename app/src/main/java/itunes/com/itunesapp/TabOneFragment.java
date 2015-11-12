package itunes.com.itunesapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by root on 7/11/15.
 */
public class TabOneFragment extends BaseFragment {

    final String[] titlesSort1 = {"One", "Two", "Three"};
    final String[] titlesSort2 = {"Banana", "Mango", "Apple"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab_one, container, false);

        List<SectionsData> sectionsDataList = new ArrayList<>();
        SectionsData sectionsData = new SectionsData();

        for (int i = 0; i < 4; i++) {
            int idxSort1 = new Random().nextInt(titlesSort1.length);
            int idxSort2 = new Random().nextInt(titlesSort2.length);

            String randomSort1 = (titlesSort1[idxSort1]);
            String randomSort2 = (titlesSort2[idxSort2]);

            sectionsData.setTitle(randomSort1 + " " + randomSort2);
            sectionsDataList.add(sectionsData);
        }

        sectionsData = new SectionsData();
        sectionsData.setTitle("SECTION 2");
        for (int i = 0; i < 3; i++) {
            int idxSort1 = new Random().nextInt(titlesSort1.length);
            int idxSort2 = new Random().nextInt(titlesSort2.length);

            String randomSort1 = (titlesSort1[idxSort1]);
            String randomSort2 = (titlesSort2[idxSort2]);

            sectionsData.setTitle(randomSort1 + " " + randomSort2);
            sectionsDataList.add(sectionsData);
        }

        RecyclerView storedList = (RecyclerView) rootView.findViewById(R.id.list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        storedList.setLayoutManager(linearLayoutManager);
        storedList.setAdapter(new SectionAdapter(R.layout.section_item, sectionsDataList));

        return rootView;
    }
}
