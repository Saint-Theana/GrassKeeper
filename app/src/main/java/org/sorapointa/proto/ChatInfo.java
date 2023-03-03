package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChatInfo {
    public static class SystemHint {
        @Tag(tag=14) public Integer type = null;
    }

    public enum SystemHintType {
        @Tag(tag=0) SYSTEM_HINT_TYPE_CHAT_NONE ,
        @Tag(tag=1) SYSTEM_HINT_TYPE_CHAT_ENTER_WORLD ,
        @Tag(tag=2) SYSTEM_HINT_TYPE_CHAT_LEAVE_WORLD ;
    }

    @Tag(tag=13) public Integer time = null;
    @Tag(tag=10) public Integer sequence = null;
    @Tag(tag=7) public Integer toUid = null;
    @Tag(tag=15) public Integer uid = null;
    @Tag(tag=5) public Boolean isRead = null;
    @Tag(tag=1946) public String text = null;
    @Tag(tag=914) public Integer icon = null;
    @Tag(tag=1753) public SystemHint systemHint = null;
}
