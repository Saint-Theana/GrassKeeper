package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeBattlePassRewardRsp {
    public enum TakeBattlePassRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2643) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public List<ItemParam> itemList = new ArrayList<>();
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public List<BattlePassRewardTakeOption> takeOptionList = new ArrayList<>();
}
