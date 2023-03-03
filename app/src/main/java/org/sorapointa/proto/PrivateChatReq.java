package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PrivateChatReq {
    @Tag(tag=7) public Integer targetUid = null;
    @Tag(tag=3) public String text = null;
    @Tag(tag=4) public Integer icon = null;
}
