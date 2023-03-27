package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerPreEnterMpNotify {
    public enum PlayerPreEnterMpNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1835) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer state = null;
    @Tag(tag=10) public Integer uid = null;
    @Tag(tag=15) public String nickname = null;
}
