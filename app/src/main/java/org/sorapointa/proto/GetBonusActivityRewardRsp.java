package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetBonusActivityRewardRsp {
    public enum GetBonusActivityRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2569) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public BonusActivityInfo bonusActivityInfoList = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
}
