package com.example.breakingbad.ui.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.breakingbad.BaseApplication;
import com.example.breakingbad.R;
import com.example.breakingbad.data.pojo.Characters;
import com.example.breakingbad.databinding.ActivityMainBinding;
import com.example.breakingbad.ui.adapter.ViewCharactersAdapter;
import com.example.breakingbad.ui.viewmodel.MainViewModel;

import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    ViewModelProvider.Factory factory;
    private MainViewModel mainViewModel;
    private ViewCharactersAdapter viewCharactersAdapter;
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        ((BaseApplication) getApplication()).getAppComponent().inject(this);
        mainViewModel = new ViewModelProvider(this, factory).get(MainViewModel.class);
        mainViewModel.getAllCharacters().observe(this, new Observer<List<Characters>>() {
            @Override
            public void onChanged(List<Characters> characters) {
                viewCharactersAdapter.submitList(characters);
            }
        });
        viewCharactersAdapter = new ViewCharactersAdapter();
        activityMainBinding.showCharactersRv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        activityMainBinding.showCharactersRv.setAdapter(viewCharactersAdapter);
    }
}