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

public class FragmentB extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("EMRE", "fragmentB onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("EMRE", "fragmentB oncreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e("EMRE", "fragmentB oncreateview");
        return inflater.inflate(R.layout.fragment_b, container, false);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        Log.e("EMRE", "fragmentB onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("EMRE", "fragmentB onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("EMRE", "fragmentB onresume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("EMRE", "fragmentB onpause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("EMRE", "fragmentB onstop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("EMRE", "fragmentB ondestroy ");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("EMRE", "fragmentB ondestroyview");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("EMRE", "fragmentB ondetach");
    }

}