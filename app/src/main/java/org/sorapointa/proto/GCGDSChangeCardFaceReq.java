package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSChangeCardFaceReq {
    public enum OGFFMKDEDLF {
        @Tag(tag=0) None ,
        @Tag(tag=7178) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=12) public Integer cardId = null;
    @Tag(tag=9) public Integer faceType = null;
}
