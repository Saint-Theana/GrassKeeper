package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DraftGuestReplyInviteRsp {
    @Tag(tag=3) public Integer draftId = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public Boolean isAgree = null;
}
