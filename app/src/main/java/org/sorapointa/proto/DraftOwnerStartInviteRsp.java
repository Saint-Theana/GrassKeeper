package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DraftInviteFailInfo.*;
import org.sorapointa.proto.DraftInviteFailInfo;

public class DraftOwnerStartInviteRsp {
    public enum DraftOwnerStartInviteRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5498) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=6) public List<DraftInviteFailInfo> inviteFailInfoList = new ArrayList<>();
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public Integer draftId = null;
    @Tag(tag=15) public Integer wrongUid = null;
}
