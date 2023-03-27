package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetPushTipsRewardRsp {
    public enum GetPushTipsRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2275) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public List<Integer> pushTipsIdList = new ArrayList<>();
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
}
