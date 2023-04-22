package com.leos.sayboard.ime.recognizers.providers;

import com.leos.sayboard.data.VoskServerData;
import com.leos.sayboard.ime.recognizers.RecognizerSource;
import com.leos.sayboard.ime.recognizers.VoskServer;
import com.leos.sayboard.preferences.ModelPreferences;

import java.util.List;

public class VoskServerProvider implements RecognizerSourceProvider{
    @Override
    public void loadSources(List<RecognizerSource> recognizerSources) {
        for (VoskServerData voskServer : ModelPreferences.getVoskServers()) {
            recognizerSources.add(new VoskServer(voskServer));
        }
    }
}
