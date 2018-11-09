package com.hardfork.a.eklekartbutonlar;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentA extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("EMRE", "fragmentA onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("EMRE", "fragmentA oncreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("EMRE", "fragmentA oncreateview");
        return inflater.inflate(R.layout.fragment_a, container, false);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        Log.d("EMRE", "fragmentA onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("EMRE", "fragmentA onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("EMRE", "fragmentA onresume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("EMRE", "fragmentA onpause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("EMRE", "fragmentA onstop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("EMRE", "fragmentA ondestroy ");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("EMRE", "fragmentA ondestroyview");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("EMRE", "fragmentA ondetach");
    }

}
