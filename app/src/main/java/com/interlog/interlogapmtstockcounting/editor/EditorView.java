package com.interlog.interlogapmtstockcounting.editor;

public interface EditorView {

    void showProgress();
    void hideProgress();
    void onRequestSuccess(String message);
    void onRequestError(String message);
}
