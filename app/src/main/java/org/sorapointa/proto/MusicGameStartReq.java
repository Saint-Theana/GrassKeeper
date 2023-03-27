package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MusicGameStartReq {
    public enum MusicGameStartReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8536) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=5) public Long ugcGuid = null;
    @Tag(tag=7) public Integer musicBasicId = null;
    @Tag(tag=15) public Boolean isSaveScore = null;
}
