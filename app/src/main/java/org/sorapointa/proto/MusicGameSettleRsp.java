package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MusicGameSettleRsp {
    public enum MusicGameSettleRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8735) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=1) public Boolean isUnlockNextLevel = null;
    @Tag(tag=7) public Long ugcGuid = null;
    @Tag(tag=4) public Integer musicBasicId = null;
    @Tag(tag=14) public Boolean isNewRecord = null;
}
