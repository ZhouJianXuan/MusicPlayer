package com.example.musicplayer;

/**
 * Created by zhou-jx on 2017/7/21.
 */

import android.graphics.Bitmap;
import android.net.Uri;

public class MusicItem {

    String name;
    Uri songUri;
    Uri albumUri;
    Bitmap thumb;
    long duration;
    long playedTime;

    MusicItem(Uri songUri, Uri albumUri, String strName, long duration, long playedTime) {
        this.name = strName;
        this.songUri = songUri;
        this.duration = duration;
        this.playedTime = playedTime;
        this.albumUri = albumUri;
    }

    @Override
    public boolean equals(Object o) {
        MusicItem another = (MusicItem) o;

        return another.songUri.equals(this.songUri);
    }
}
