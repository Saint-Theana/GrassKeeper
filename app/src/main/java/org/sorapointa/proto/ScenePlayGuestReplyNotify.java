package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePlayGuestReplyNotify {
    @Tag(tag=13) public Integer playId = null;
    @Tag(tag=12) public Integer guestUid = null;
    @Tag(tag=3) public Boolean isAgree = null;
}
