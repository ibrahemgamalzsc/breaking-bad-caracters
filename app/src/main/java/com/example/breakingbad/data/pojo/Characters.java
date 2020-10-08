package com.example.breakingbad.data.pojo;

import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.DiffUtil;

import com.squareup.picasso.Picasso;

import java.util.List;

public class Characters {
    public Integer charId;
    public String name;
    public String birthday;
    public List<String> occupation;
    public String img;
    public String status;
    public String nickname;
    public List<Integer> appearance;
    public String portrayed;
    public String category;
    public List<Integer> betterCallSaulAppearance;

    public Integer getCharId() {
        return charId;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public List<String> getOccupation() {
        return occupation;
    }

    public String getImg() {
        return img;
    }

    public String getStatus() {
        return status;
    }

    public String getNickname() {
        return nickname;
    }

    public List<Integer> getAppearance() {
        return appearance;
    }

    public String getPortrayed() {
        return portrayed;
    }

    public String getCategory() {
        return category;
    }

    public List<Integer> getBetterCallSaulAppearance() {
        return betterCallSaulAppearance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Characters that = (Characters) o;
        return getCharId().equals(that.getCharId()) &&
                getName().equals(that.getName()) &&
                getBirthday().equals(that.getBirthday()) &&
                getOccupation().equals(that.getOccupation()) &&
                getImg().equals(that.getImg()) &&
                getStatus().equals(that.getStatus()) &&
                getNickname().equals(that.getNickname()) &&
                getAppearance().equals(that.getAppearance()) &&
                getPortrayed().equals(that.getPortrayed()) &&
                getCategory().equals(that.getCategory()) &&
                getBetterCallSaulAppearance().equals(that.getBetterCallSaulAppearance());
    }

    public static DiffUtil.ItemCallback<Characters> callback = new DiffUtil.ItemCallback<Characters>() {
        @Override
        public boolean areItemsTheSame(@NonNull Characters oldItem, @NonNull Characters newItem) {
            return oldItem.getCharId().equals(newItem.getCharId());
        }

        @Override
        public boolean areContentsTheSame(@NonNull Characters oldItem, @NonNull Characters newItem) {
            return oldItem.equals(newItem);
        }
    };

    @BindingAdapter("android:setImageSrc")
    public static void setImage(ImageView image, String imageUri) {
        Picasso.get().load(imageUri).fit().into(image);
    }
}
