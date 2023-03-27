package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FleurFairMusicGameStartRsp {
    public enum FleurFairMusicGameStartRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2088) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public Integer musicBasicId = null;
}
