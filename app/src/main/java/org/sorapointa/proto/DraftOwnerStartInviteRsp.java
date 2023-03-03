package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DraftInviteFailInfo.*;
import org.sorapointa.proto.DraftInviteFailInfo;

public class DraftOwnerStartInviteRsp {
    @Tag(tag=15) public List<DraftInviteFailInfo> inviteFailInfoList = new ArrayList<>();
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public Integer wrongUid = null;
    @Tag(tag=14) public Integer draftId = null;
}
