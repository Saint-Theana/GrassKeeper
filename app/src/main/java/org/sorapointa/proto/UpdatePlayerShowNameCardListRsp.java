package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UpdatePlayerShowNameCardListRsp {
    public enum UpdatePlayerShowNameCardListRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4023) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public List<Integer> showNameCardIdList = new ArrayList<>();
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
}
