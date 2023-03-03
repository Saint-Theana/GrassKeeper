package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DraftGuestReplyTwiceConfirmReq {
    @Tag(tag=15) public Boolean isAgree = null;
    @Tag(tag=14) public Integer draftId = null;
}
