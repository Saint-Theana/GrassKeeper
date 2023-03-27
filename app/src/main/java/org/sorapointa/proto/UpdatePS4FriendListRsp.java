package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UpdatePS4FriendListRsp {
    public enum UpdatePS4FriendListRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4065) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=7) public List<String> psnIdList = new ArrayList<>();
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
}
