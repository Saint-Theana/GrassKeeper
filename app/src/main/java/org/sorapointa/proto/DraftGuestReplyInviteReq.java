package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DraftGuestReplyInviteReq {
    @Tag(tag=10) public Integer draftId = null;
    @Tag(tag=3) public Boolean isAgree = null;
}
