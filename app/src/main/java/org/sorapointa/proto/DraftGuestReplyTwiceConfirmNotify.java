package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DraftGuestReplyTwiceConfirmNotify {
    @Tag(tag=14) public Boolean isAgree = null;
    @Tag(tag=15) public Integer draftId = null;
    @Tag(tag=7) public Integer guestUid = null;
}
