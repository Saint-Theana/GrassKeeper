package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MpPlayGuestReplyInviteReq {
    @Tag(tag=3) public Integer mpPlayId = null;
    @Tag(tag=15) public Boolean isAgree = null;
}
