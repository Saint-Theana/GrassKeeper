package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerNicknameNotify {
    public enum PlayerNicknameNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=133) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public String nickname = null;
}
