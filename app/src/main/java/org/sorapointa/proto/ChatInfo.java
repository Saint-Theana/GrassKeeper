package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChatInfo {
    public static class ChatInfo_SystemHint {
        @Tag(tag=14) public Integer type = null;
    }

    @Tag(tag=6) public Boolean isRead = null;
    @Tag(tag=15) public Integer uid = null;
    @Tag(tag=3) public Integer toUid = null;
    @Tag(tag=1809) public String text = null;
    @Tag(tag=1168) public Integer icon = null;
    @Tag(tag=523) public ChatInfo_SystemHint systemHint = null;
    @Tag(tag=2) public Integer sequence = null;
    @Tag(tag=11) public Integer time = null;
}
