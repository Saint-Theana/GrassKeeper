package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSChangeCardFaceReq {
    @Tag(tag=6) public Integer faceType = null;
    @Tag(tag=3) public Integer cardId = null;
}
