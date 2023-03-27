package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerInjectFixNotify {
    public enum PlayerInjectFixNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=126) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Integer id = null;
    @Tag(tag=6) public byte[] injectFix = null;
}
