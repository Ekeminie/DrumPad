package com.example.android.drumpad;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bass_pad) View bassPad;
    @BindView(R.id.snare_pad) View snarePad;
    @BindView(R.id.tom1_pad) View tom1Pad;
    @BindView(R.id.tom2_pad) View tom2Pad;
    @BindView(R.id.cymbal1_pad) View cymbal1Pad;
    @BindView(R.id.cymbal2_pad) View cymbal2Pad;
    @BindView(R.id.hihat1_pad) View hihat1Pad;
    @BindView(R.id.hihat2_pad) View hihat2Pad;
    MediaPlayer mediaPlayer, bassPadMp, snarePadMp, tom1PadMp, tom2PadMp, cymbal1PadMp, cymbal2PadMp, hihat1PadMp, hihat2PadMp;
    float count = 100 * .01f;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        getAudioFIles();

        setOnClickListeners();

    }

    private void setOnClickListeners() {
        bassPad.setOnClickListener(play_sound);
        snarePad.setOnClickListener(play_sound);
        tom1Pad.setOnClickListener(play_sound);
        tom2Pad.setOnClickListener(play_sound);
        cymbal1Pad.setOnClickListener(play_sound);
        cymbal2Pad.setOnClickListener(play_sound);
        hihat1Pad.setOnClickListener(play_sound);
        hihat2Pad.setOnClickListener(play_sound);
    }

    private void getAudioFIles() {
        bassPadMp = MediaPlayer.create(MainActivity.this, R.raw.bass);
        snarePadMp = MediaPlayer.create(MainActivity.this, R.raw.snare);
        tom1PadMp = MediaPlayer.create(MainActivity.this, R.raw.tom1);
        tom2PadMp = MediaPlayer.create(MainActivity.this, R.raw.tom2);
        cymbal1PadMp = MediaPlayer.create(MainActivity.this, R.raw.crashcymbal);
        cymbal2PadMp = MediaPlayer.create(MainActivity.this, R.raw.ridecymbal);
        hihat1PadMp = MediaPlayer.create(MainActivity.this, R.raw.openhihat);
        hihat2PadMp = MediaPlayer.create(MainActivity.this, R.raw.closehihat);
    }

    View.OnClickListener play_sound = new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.bass_pad:

                    if (bassPadMp != null) {
                        bassPadMp.stop();
                        bassPadMp.release();
                    }
                    bassPadMp = MediaPlayer.create(MainActivity.this, R.raw.bass);
                    bassPadMp.setVolume(count, count);
                    bassPadMp.start();
                    break;
                case R.id.snare_pad:
                    if (snarePadMp != null) {
                        snarePadMp.stop();
                        snarePadMp.release();
                    }
                    snarePadMp = MediaPlayer.create(MainActivity.this,
                            R.raw.snare);
                    snarePadMp.setVolume(count, count);
                    snarePadMp.start();

                    break;
                case R.id.tom1_pad:
                    if (tom1PadMp != null) {
                        tom1PadMp.stop();
                        tom1PadMp.release();
                    }
                    tom1PadMp = MediaPlayer.create(MainActivity.this, R.raw.tom1);

                    tom1PadMp.setVolume(count, count);
                    tom1PadMp.start();
                    break;
                case R.id.tom2_pad:
                    if (tom2PadMp != null) {
                        tom2PadMp.stop();
                        tom2PadMp.release();
                    }
                    tom2PadMp = MediaPlayer.create(MainActivity.this, R.raw.tom2);

                    tom2PadMp.setVolume(count, count);
                    tom2PadMp.start();
                    break;
                case R.id.cymbal1_pad:
                    if (cymbal1PadMp != null) {
                        cymbal1PadMp.stop();
                        cymbal1PadMp.release();
                    }
                    cymbal1PadMp = MediaPlayer.create(MainActivity.this,
                            R.raw.crashcymbal);

                    cymbal1PadMp.setVolume(count, count);
                    cymbal1PadMp.start();
                    break;
                case R.id.cymbal2_pad:
                    if (cymbal2PadMp != null) {
                        cymbal2PadMp.stop();
                        cymbal2PadMp.release();
                    }
                    cymbal2PadMp = MediaPlayer.create(MainActivity.this,
                            R.raw.ridecymbal);

                    cymbal2PadMp.setVolume(count, count);
                    cymbal2PadMp.start();

                    break;
                case R.id.hihat1_pad:
                    if (hihat1PadMp != null) {
                        hihat1PadMp.stop();
                        hihat1PadMp.release();
                    }
                    hihat1PadMp = MediaPlayer.create(MainActivity.this,
                            R.raw.openhihat);

                    hihat1PadMp.setVolume(count, count);
                    hihat1PadMp.start();

                    break;
                case R.id.hihat2_pad:
                    if (hihat2PadMp != null) {
                        hihat2PadMp.stop();
                        hihat2PadMp.release();
                    }
                    hihat2PadMp = MediaPlayer.create(MainActivity.this,
                            R.raw.closehihat);

                    hihat2PadMp.setVolume(count, count);
                    hihat2PadMp.start();
                    break;
                default:
                    break;
            }
        }

    };


}

