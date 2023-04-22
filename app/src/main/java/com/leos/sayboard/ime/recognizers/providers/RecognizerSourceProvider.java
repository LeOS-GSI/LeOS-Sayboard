package com.leos.sayboard.ime.recognizers.providers;

import com.leos.sayboard.ime.recognizers.RecognizerSource;

import java.util.List;

public interface RecognizerSourceProvider {
    void loadSources(List<RecognizerSource> recognizerSources);
}
