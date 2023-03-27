package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSCardFaceUnlockNotify {
    public enum KLACDDBMIDG {
        @Tag(tag=0) None ,
        @Tag(tag=7126) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer faceType = null;
    @Tag(tag=6) public Integer cardId = null;
}
