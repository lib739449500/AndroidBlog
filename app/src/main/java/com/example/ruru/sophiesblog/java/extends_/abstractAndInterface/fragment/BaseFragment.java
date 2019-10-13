package com.example.ruru.sophiesblog.java.extends_.abstractAndInterface.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(getContentViewId(), container);

        initMembersView(savedInstanceState);
        return view;
    }

    protected abstract void initMembersView(Bundle savedInstanceState);

    public abstract int getContentViewId();

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
