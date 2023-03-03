package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PullPrivateChatReq {
    @Tag(tag=5) public Integer targetUid = null;
    @Tag(tag=7) public Integer pullNum = null;
    @Tag(tag=12) public Integer fromSequence = null;
}
