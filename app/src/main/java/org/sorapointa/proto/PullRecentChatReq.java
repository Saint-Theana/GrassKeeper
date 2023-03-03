package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PullRecentChatReq {
    @Tag(tag=6) public Integer pullNum = null;
    @Tag(tag=15) public Integer beginSequence = null;
}
