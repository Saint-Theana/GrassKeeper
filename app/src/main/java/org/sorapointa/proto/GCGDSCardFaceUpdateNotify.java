package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSCardFaceUpdateNotify {
    public enum LNHHPEEHCIF {
        @Tag(tag=0) None ,
        @Tag(tag=7763) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Integer faceType = null;
    @Tag(tag=1) public Integer cardId = null;
}
