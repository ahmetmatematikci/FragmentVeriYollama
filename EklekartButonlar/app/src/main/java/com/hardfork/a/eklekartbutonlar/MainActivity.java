package com.hardfork.a.eklekartbutonlar;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager=getFragmentManager();
    }


    public void addFragmentA(View v){

        FragmentA fragmentA=new FragmentA();

        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.container, fragmentA, "fragA");
        transaction.commit();



    }

    public void addFragmentB(View v){

        FragmentB fragmentB=new FragmentB();

        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.container, fragmentB, "fragB");
        transaction.commit();

    }

    public void removeFragmentA(View v){

        FragmentA fragmentA= (FragmentA) manager.findFragmentByTag("fragA");
        FragmentTransaction transaction=manager.beginTransaction();
        if(fragmentA!=null) {
            transaction.remove(fragmentA);
            transaction.commit();
        }else{
            Toast.makeText(this,"Fragment A bulunamadı", Toast.LENGTH_LONG).show();
        }

    }

    public void removeFragmentB(View v){
        FragmentB fragmentB= (FragmentB) manager.findFragmentByTag("fragB");
        FragmentTransaction transaction=manager.beginTransaction();
        if(fragmentB!=null) {
            transaction.remove(fragmentB);
            transaction.commit();
        }else{
            Toast.makeText(this,"Fragment B bulunamadı", Toast.LENGTH_LONG).show();
        }

    }

    //Buradan devam et
    public void replaceByFragmentA(View v){

        FragmentA fragmentA=new FragmentA();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.replace(R.id.container, fragmentA, "fragA");
        transaction.commit();

    }

    public void replaceByFragmentB(View v){

        FragmentB fragmentB=new FragmentB();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.replace(R.id.container, fragmentB, "fragB");
        transaction.commit();

    }

    public void attachFragmentA(View v){

        FragmentA fragmentA= (FragmentA) manager.findFragmentByTag("fragA");
        FragmentTransaction transaction=manager.beginTransaction();
        if(fragmentA!=null)
        {
            transaction.attach(fragmentA);
            transaction.commit();
        }
        else{
            Toast.makeText(this,"Fragment A bulunamadı", Toast.LENGTH_LONG).show();
        }


    }

    public void detachFragmentA(View v){

        FragmentA fragmentA= (FragmentA) manager.findFragmentByTag("fragA");
        FragmentTransaction transaction=manager.beginTransaction();
        if(fragmentA!=null)
        {
            transaction.detach(fragmentA);
            transaction.commit();
        }
        else{
            Toast.makeText(this,"Fragment A bulunamadı", Toast.LENGTH_LONG).show();
        }


    }

    public void showFragmentA(View v){


        FragmentA fragmentA=(FragmentA) manager.findFragmentByTag("fragA");
        FragmentTransaction transaction=manager.beginTransaction();

        if(fragmentA!=null){
            transaction.show(fragmentA);
            transaction.commit();
        }else{
            Toast.makeText(this,"Fragment A bulunamadı", Toast.LENGTH_LONG).show();
        }


    }

    public void hideFragmentA(View v){

        FragmentA fragmentA=(FragmentA) manager.findFragmentByTag("fragA");
        FragmentTransaction transaction=manager.beginTransaction();

        if(fragmentA!=null){
            transaction.hide(fragmentA);
            transaction.commit();
        }else{
            Toast.makeText(this,"Fragment A bulunamadı", Toast.LENGTH_LONG).show();
        }

    }

}