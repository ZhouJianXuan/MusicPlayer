package com.example.musicplayer_1_3;

import android.graphics.Bitmap;
import android.net.Uri;

/**
 * Created by zhou-jx on 2017/7/25.
 */

public class MusicItem {
    String name;
    Uri songUri;
    Uri albumUri;
    Bitmap thumb;
    long duration;

    MusicItem(Uri songUri, Uri albumUri, String strName, long duration, int i) {
        this.name = strName;
        this.songUri = songUri;
        this.duration = duration;
        this.albumUri = albumUri;
    }


}
