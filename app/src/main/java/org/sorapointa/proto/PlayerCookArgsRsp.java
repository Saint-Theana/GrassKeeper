package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerCookArgsRsp {
    public enum PlayerCookArgsRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=111) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=6,isFloat=true) public Float qteRangeRatio = null;
}
