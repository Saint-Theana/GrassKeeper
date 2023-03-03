package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSCardFaceUnlockNotify {
    @Tag(tag=13) public Integer cardId = null;
    @Tag(tag=1) public Integer faceType = null;
}
