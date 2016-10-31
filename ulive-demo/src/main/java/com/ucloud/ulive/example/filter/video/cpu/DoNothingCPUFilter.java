package com.ucloud.ulive.example.filter.video.cpu;

import com.ucloud.ulive.filter.UVideoCPUFilter;

public class DoNothingCPUFilter extends UVideoCPUFilter {
    @Override
    public boolean onFrame(byte[] orignBuff, byte[] targetBuff, long presentationTimeMs, int sequenceNum) {
        return false;
    }
}
