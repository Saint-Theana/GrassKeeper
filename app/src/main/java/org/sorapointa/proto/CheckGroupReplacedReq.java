package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CheckGroupReplacedReq {
    public enum IFJJADJGMGG {
        @Tag(tag=0) None ,
        @Tag(tag=3329) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=7) public List<Integer> groupIdList = new ArrayList<>();
}
