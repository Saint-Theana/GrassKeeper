package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetFriendRemarkNameRsp {
    public enum SetFriendRemarkNameRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4081) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public String remarkName = null;
    @Tag(tag=14) public Integer uid = null;
    @Tag(tag=6) public Boolean isClearRemark = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
}
