package com.designpatterns.proxy.media_library;

import java.util.HashMap;

//  Remote service interface
public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
