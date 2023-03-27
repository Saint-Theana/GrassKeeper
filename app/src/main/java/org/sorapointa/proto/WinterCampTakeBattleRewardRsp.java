package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WinterCampTakeBattleRewardRsp {
    public enum WinterCampTakeBattleRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8088) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Integer id = null;
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
}
