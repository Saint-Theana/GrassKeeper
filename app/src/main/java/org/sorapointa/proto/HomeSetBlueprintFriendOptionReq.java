package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeSetBlueprintFriendOptionReq {
    public enum OBHPDCNHJCO {
        @Tag(tag=0) None ,
        @Tag(tag=4590) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public Boolean isAllowFriendCopy = null;
}
