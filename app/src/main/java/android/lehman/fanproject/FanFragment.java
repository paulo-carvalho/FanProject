package android.lehman.fanproject;

import android.app.Fragment;
import android.media.Image;
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

    private ImageView fanRotor;
    private Animation rotation;

    public FanFragment () {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fan, container, false);

        fanRotor = (ImageView)rootView.findViewById(R.id.imageFan);
        rotation = AnimationUtils.loadAnimation(getActivity(), R.anim.rotate);
        rotation.setFillAfter(true);

        ImageView buttonOn = (ImageView)rootView.findViewById(R.id.buttonOn);
        buttonOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fanRotor.startAnimation(rotation);
            }
        });

        ImageView buttonOff = (ImageView)rootView.findViewById(R.id.buttonOff);
        buttonOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fanRotor.clearAnimation();
            }
        });

        ImageView buttonSpeedOne = (ImageView)rootView.findViewById(R.id.buttonSpeedOne);
        buttonSpeedOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rotation.setDuration(750);
                fanRotor.startAnimation(rotation);
            }
        });

        ImageView buttonSpeedTwo = (ImageView)rootView.findViewById(R.id.buttonSpeedTwo);
        buttonSpeedTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rotation.setDuration(500);
                fanRotor.startAnimation(rotation);
            }
        });

        ImageView buttonSpeedThree = (ImageView)rootView.findViewById(R.id.buttonSpeedThree);
        buttonSpeedThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rotation.setDuration(250);
                fanRotor.startAnimation(rotation);
            }
        });
        return rootView;
    }
}
