package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DraftGuestReplyInviteNotify {
    @Tag(tag=5) public Integer draftId = null;
    @Tag(tag=9) public Boolean isAgree = null;
    @Tag(tag=10) public Integer guestUid = null;
}
