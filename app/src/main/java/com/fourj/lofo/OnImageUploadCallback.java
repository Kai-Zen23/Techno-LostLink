package com.fourj.lofo;

public interface OnImageUploadCallback {
    void onSuccess(String imageUrl);

    void onFailure();
}
