package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerGameTimeNotify {
    public enum PlayerGameTimeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=124) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1) public Integer gameTime = null;
    @Tag(tag=3) public Boolean isHome = null;
    @Tag(tag=14) public Integer uid = null;
}
