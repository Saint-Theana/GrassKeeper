package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FleurFairMusicGameSettleRsp {
    public enum FleurFairMusicGameSettleRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2200) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Integer musicBasicId = null;
    @Tag(tag=5) public Boolean isNewRecord = null;
    @Tag(tag=7) public Boolean isUnlockNextLevel = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
