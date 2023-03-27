package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetMailItemReq {
    public enum GetMailItemReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1498) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public List<Integer> mailIdList = new ArrayList<>();
}
