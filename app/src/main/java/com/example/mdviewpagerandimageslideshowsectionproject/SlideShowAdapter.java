package com.example.mdviewpagerandimageslideshowsectionproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SlideShowAdapter extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private List<Integer> images;

    public SlideShowAdapter(Context context) {
        this.context = context;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        images = new ArrayList<Integer>() {{
            add(R.drawable.angrybirds);
            add(R.drawable.asphalt8);
            add(R.drawable.clashofclans);
            add(R.drawable.cuttherope);
            add(R.drawable.fruitninja);
            add(R.drawable.pou);
            add(R.drawable.talkingtom);
            add(R.drawable.wheresmywhater);
            add(R.drawable.worms3);
        }};
    }

    @Override
    public int getCount() {
        return images.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == object);
    }

    // Inside the following instantiateItem() method our images are loaded into the ImageView.
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = layoutInflater.inflate(R.layout.slideshow_layout, container, false);
        ImageView imageView = view.findViewById(R.id.image_view);
        imageView.setImageResource(images.get(position));
        container.addView(view);
        return view;
    }

    /*
    In the slide show, when we move from say for e.g. image 1 to image 2, then image 1 is removed
    from the slide show and thus destroyItem() method is called at that time.
    */
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
    }
}
