package growithbig.technest.scheduledtask.HomeScreen;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import growithbig.technest.scheduledtask.AdapterManager.TaskAdapter;
import growithbig.technest.scheduledtask.Model.CurrentTaskDataitems;
import growithbig.technest.scheduledtask.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    ArrayList<CurrentTaskDataitems> dataModels;

    RecyclerView reyclerview;
    RecyclerView.LayoutManager layoutManager;
    private static CurrentTaskDataitems adapter;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_home, container, false);


        reyclerview = (RecyclerView) v.findViewById(R.id.recyclertask);

        showData();

        return v;
    }


    public void showData() {

        dataModels = new ArrayList<>();
        dataModels.add(new CurrentTaskDataitems("Apple Pie", "Android 1.0", "1", "September 23, 2008", "", "Install camera1"));
        dataModels.add(new CurrentTaskDataitems("Banana Bread", "Android 1.1", "2", "February 9, 2009", "", "Install camera2"));
        dataModels.add(new CurrentTaskDataitems("Cupcake", "Android 1.5", "3", "April 27, 2009", "", "Install camera3"));
        dataModels.add(new CurrentTaskDataitems("Donut", "Android 1.6", "4", "September 15, 2009", "", "Install camera4"));
        dataModels.add(new CurrentTaskDataitems("Eclair", "Android 2.0", "5", "October 26, 2009", "", "Install camera5"));
        dataModels.add(new CurrentTaskDataitems("Froyo", "Android 2.2", "8", "May 20, 2010", "", "Install camera6"));
        dataModels.add(new CurrentTaskDataitems("Honeycomb", "Android 3.0", "11", "February 22, 2011", "", "Install camera7"));

        TaskAdapter taskAdapter = new TaskAdapter(dataModels, getActivity());

        layoutManager = new LinearLayoutManager(getContext());
        reyclerview.setAdapter(taskAdapter);
        reyclerview.setLayoutManager(layoutManager);
        reyclerview.setHasFixedSize(true);

    }

}
