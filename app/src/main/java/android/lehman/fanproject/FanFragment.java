package android.lehman.fanproject;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Class from FanProject at android.lehman.fanproject
 * Created by Paulo-Lehman on 4/10/2015.
 */
public class FanFragment extends Fragment {

    public FanFragment () {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fan, container, false);
        ImageView btn_rotate = (ImageView)rootView.findViewById(R.id.imageFan);
        Animation rotation = AnimationUtils.loadAnimation(getActivity(), R.anim.rotate);
        rotation.setFillAfter(true);
        btn_rotate.startAnimation(rotation);
        return rootView;
    }
}
