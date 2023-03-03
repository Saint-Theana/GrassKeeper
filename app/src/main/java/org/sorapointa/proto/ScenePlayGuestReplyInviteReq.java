package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePlayGuestReplyInviteReq {
    @Tag(tag=15) public Boolean isAgree = null;
    @Tag(tag=6) public Integer playId = null;
}
