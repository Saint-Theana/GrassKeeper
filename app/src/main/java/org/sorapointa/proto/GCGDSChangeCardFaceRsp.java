package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSChangeCardFaceRsp {
    public enum CMAKFMMIJKK {
        @Tag(tag=0) None ,
        @Tag(tag=7641) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Integer faceType = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public Integer cardId = null;
}
