package com.mukeshkumar.secblock;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    int[] images = {
            R.drawable.welcome,
            R.drawable.new_technology,
            R.drawable.block_generation,
            R.drawable.decentralized_server,
            R.drawable.lets_begin
    };

    int[] headings = {
            R.string.intro_heading1,
            R.string.intro_heading2,
            R.string.intro_heading3,
            R.string.intro_heading4,
            R.string.intro_heading5
    };
    int[] descriptions = {
            R.string.intro_description1,
            R.string.intro_description2,
            R.string.intro_description3,
            R.string.intro_description4,
            R.string.intro_description5
    };

    @Override
    public int getCount() {
        return headings.length;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slides_layout, container, false);
        ImageView imageView = view.findViewById(R.id.slider_image);
        TextView heading = view.findViewById(R.id.slider_heading);
        TextView desc = view.findViewById(R.id.slider_desc);
        imageView.setImageResource(images[position]);
        heading.setText(headings[position]);
        desc.setText(descriptions[position]);
        container.addView(view);
        return view;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout) object);
    }
}
