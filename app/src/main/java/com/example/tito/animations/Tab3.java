package com.example.tito.animations;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;



public class Tab3 extends Fragment  {


    Button btnFadeIn, btnFadeOut, btnCrossFade, btnBlink, btnZoomIn,
            btnZoomOut, btnRotate, btnMove, btnSlideUp, btnSlideDown,
            btnBounce, btnSequential, btnTogether;
    Animation animFadeIn,animFadeOut,animBlink,animZoomIn,animZoomOut,animRotate
            ,animMove,animSlideUp,animSlideDown,animBounce,animSequential,animTogether,animCrossFadeIn,animCrossFadeOut;
    CardView imageView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab3, container, false);
        btnFadeIn = (Button)rootView.findViewById(R.id.btnFadeIn);
        btnFadeOut = (Button) rootView.findViewById(R.id.btnFadeOut);
        btnCrossFade = (Button)rootView.findViewById(R.id.btnCrossFade);
        btnZoomIn = (Button)rootView.findViewById(R.id.btnZoomIn);
        btnZoomOut = (Button)rootView.findViewById(R.id.btnZoomOut);
        btnRotate = (Button)rootView.findViewById(R.id.btnRotate);
        btnMove = (Button)rootView.findViewById(R.id.btnMove);
        btnSlideUp = (Button)rootView.findViewById(R.id.btnSlideUp);
        btnSlideDown = (Button)rootView.findViewById(R.id.btnSlideDown);
        btnBounce = (Button)rootView.findViewById(R.id.btnBounce);
        btnSequential = (Button)rootView.findViewById(R.id.btnSequential);
        btnTogether = (Button)rootView.findViewById(R.id.btnTogether);
        imageView=(CardView) rootView.findViewById(R.id.imgview);
        animFadeIn = AnimationUtils.loadAnimation(getActivity(),
                R.anim.fade_in);

        animFadeIn = AnimationUtils.loadAnimation(getActivity(),
                R.anim.fade_in);
        // fade in
        btnFadeIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(animFadeIn);
            }
        });

        animFadeOut = AnimationUtils.loadAnimation(getActivity(),
                R.anim.fade_out);

        // fade out
        btnFadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(animFadeOut);
            }
        });
        animCrossFadeIn = AnimationUtils.loadAnimation(getActivity(),
                R.anim.fade_in);
        animCrossFadeOut = AnimationUtils.loadAnimation(getActivity(),
                R.anim.fade_out);
        // cross fade
        btnCrossFade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                // start fade in animation
                imageView.startAnimation(animCrossFadeIn);

                // start fade out animation
                imageView.startAnimation(animCrossFadeOut);
            }
        });

        animZoomIn = AnimationUtils.loadAnimation(getActivity(),
                R.anim.zoom_in);
        // Zoom In
        btnZoomIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(animZoomIn);
            }
        });
        animZoomOut = AnimationUtils.loadAnimation(getActivity(),
                R.anim.zoom_out);
        // Zoom Out
        btnZoomOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(animZoomOut);
            }
        });
        animRotate = AnimationUtils.loadAnimation(getActivity(),
                R.anim.rotate);

        // Rotate
        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(animRotate);
            }
        });
        animMove = AnimationUtils.loadAnimation(getActivity(),
                R.anim.move);
        // Move
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(animMove);
            }
        });
        animSlideUp = AnimationUtils.loadAnimation(getActivity(),
                R.anim.slide_up);
        // Slide Up
        btnSlideUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(animSlideUp);
            }
        });
        animSlideDown = AnimationUtils.loadAnimation(getActivity(),
                R.anim.slide_down);
        // Slide Down
        btnSlideDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {imageView.startAnimation(animSlideDown);
            }
        });
        animBounce = AnimationUtils.loadAnimation(getActivity(),
                R.anim.bounce);
        // Slide Down
        btnBounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(animBounce);
            }
        });
        animSequential = AnimationUtils.loadAnimation(getActivity(),
                R.anim.sequential);
        // Sequential
        btnSequential.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imageView.startAnimation(animSequential);
            }
        });
        animTogether = AnimationUtils.loadAnimation(getActivity(),
                R.anim.together);

        // Together
        btnTogether.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(animTogether);
            }
        });

return rootView;
    }
}

