package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MpPlayGuestReplyNotify {
    @Tag(tag=7) public Integer uid = null;
    @Tag(tag=4) public Boolean isAgree = null;
    @Tag(tag=14) public Integer mpPlayId = null;
}
