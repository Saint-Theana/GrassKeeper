package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChatChannelShieldNotify {
    public enum INDNLFBPOGA {
        @Tag(tag=0) None ,
        @Tag(tag=4966) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public Integer channelId = null;
    @Tag(tag=1) public Boolean isShield = null;
}
