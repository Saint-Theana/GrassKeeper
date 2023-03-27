package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UpdatePlayerShowNameCardListReq {
    public enum UpdatePlayerShowNameCardListReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4063) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=14) public List<Integer> showNameCardIdList = new ArrayList<>();
}
