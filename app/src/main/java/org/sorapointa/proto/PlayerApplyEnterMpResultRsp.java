package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerApplyEnterMpResultRsp {
    public enum PlayerApplyEnterMpResultRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1843) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer applyUid = null;
    @Tag(tag=9) public Boolean isAgreed = null;
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public Integer param = null;
}
