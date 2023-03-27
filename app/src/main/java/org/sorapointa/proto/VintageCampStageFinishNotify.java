package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageCampStageFinishNotify {
    public enum HACIDCALPKB {
        @Tag(tag=0) None ,
        @Tag(tag=23644) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer stageId = null;
}
