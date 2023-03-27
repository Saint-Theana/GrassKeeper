package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BonusActivityInfoRsp {
    public enum BonusActivityInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2516) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public List<BonusActivityInfo> bonusActivityInfoList = new ArrayList<>();
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
