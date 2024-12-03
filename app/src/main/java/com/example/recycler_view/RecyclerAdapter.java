package com.example.recycler_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/** @noinspection ALL*/
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.DogBreedViewHolder> {
    private List<DogBreed> dogBreeds;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(DogBreed dogBreed);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public RecyclerAdapter(List<DogBreed> dogBreeds) {
        this.dogBreeds = dogBreeds;
    }

    @NonNull
    @Override
    public DogBreedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new DogBreedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DogBreedViewHolder holder, int position) {
        DogBreed currentDogBreed = dogBreeds.get(position);
        holder.bind(currentDogBreed, listener);
    }

    @Override
    public int getItemCount() {
        return dogBreeds.size();
    }

    static class DogBreedViewHolder extends RecyclerView.ViewHolder {
        private ImageView dogImage;
        private TextView dogName;

        public DogBreedViewHolder(@NonNull View itemView) {
            super(itemView);
            dogImage = itemView.findViewById(R.id.dogImage);
            dogName = itemView.findViewById(R.id.dogName);
        }

        public void bind(final DogBreed dogBreed, final OnItemClickListener listener) {
            dogName.setText(dogBreed.getName());
            dogImage.setImageResource(dogBreed.getImageResId());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(dogBreed);
                }
            });
        }
    }
}
