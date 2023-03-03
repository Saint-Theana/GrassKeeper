package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSChangeCardFaceRsp {
    @Tag(tag=8) public Integer faceType = null;
    @Tag(tag=4) public Integer cardId = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
}
