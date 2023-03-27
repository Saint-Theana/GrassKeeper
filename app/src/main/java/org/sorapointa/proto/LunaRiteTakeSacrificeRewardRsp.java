package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LunaRiteTakeSacrificeRewardRsp {
    public enum LunaRiteTakeSacrificeRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8806) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public Integer sacrificeRewardIndex = null;
    @Tag(tag=8) public Integer areaId = null;
    @Tag(tag=2) public Integer index = null;
    @Tag(tag=14) public List<Integer> sacrificeRewardList = new ArrayList<>();
}
