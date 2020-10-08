package com.example.breakingbad.ui.adapter;


import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.breakingbad.data.pojo.Characters;
import com.example.breakingbad.databinding.CharacterHolderBinding;

public class ViewCharactersAdapter extends ListAdapter<Characters, ViewCharactersAdapter.CharacterHolder> {
    public ViewCharactersAdapter() {
        super(Characters.callback);
    }

    @NonNull
    @Override
    public CharacterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        CharacterHolderBinding characterHolderBinding = CharacterHolderBinding.inflate(layoutInflater, parent, false);
        return new CharacterHolder(characterHolderBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CharacterHolder holder, int position) {
        Characters character = getItem(position);
        holder.characterHolderBinding.setCharacters(character);
    }

    public class CharacterHolder extends RecyclerView.ViewHolder {

        private CharacterHolderBinding characterHolderBinding;

        public CharacterHolder(@NonNull CharacterHolderBinding characterHolderBinding) {
            super(characterHolderBinding.getRoot());
            this.characterHolderBinding = characterHolderBinding;
        }
    }
}
