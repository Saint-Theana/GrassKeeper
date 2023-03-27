package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerApplyEnterHomeResultRsp {
    public enum PlayerApplyEnterHomeResultRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4869) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Integer applyUid = null;
    @Tag(tag=10) public Boolean isAgreed = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public Integer param = null;
}
