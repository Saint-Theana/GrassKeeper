package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePlayGuestReplyInviteRsp {
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public Boolean isAgree = null;
    @Tag(tag=8) public Integer playId = null;
}
