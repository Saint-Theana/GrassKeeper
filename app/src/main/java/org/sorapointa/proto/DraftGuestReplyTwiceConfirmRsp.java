package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DraftGuestReplyTwiceConfirmRsp {
    @Tag(tag=5) public Integer draftId = null;
    @Tag(tag=13) public Boolean isAgree = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
