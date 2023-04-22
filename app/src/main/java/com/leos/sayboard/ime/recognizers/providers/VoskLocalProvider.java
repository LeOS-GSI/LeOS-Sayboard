package com.leos.sayboard.ime.recognizers.providers;

import com.leos.sayboard.Tools;
import com.leos.sayboard.data.LocalModel;
import com.leos.sayboard.ime.IME;
import com.leos.sayboard.ime.recognizers.RecognizerSource;
import com.leos.sayboard.ime.recognizers.VoskLocal;

import java.util.List;

public class VoskLocalProvider implements RecognizerSourceProvider {
    private final IME ime;

    public VoskLocalProvider(IME ime) {
        this.ime = ime;
    }

    @Override
    public void loadSources(List<RecognizerSource> recognizerSources) {
        for (LocalModel localModel : Tools.getInstalledModelsList(ime)) {
            recognizerSources.add(new VoskLocal(localModel));
        }
    }
}
