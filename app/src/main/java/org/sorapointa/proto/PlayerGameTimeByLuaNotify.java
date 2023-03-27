package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerGameTimeByLuaNotify {
    public enum MIMNLEBNAHI {
        @Tag(tag=0) None ,
        @Tag(tag=121) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer uid = null;
    @Tag(tag=1) public Integer simSpeed = null;
    @Tag(tag=8) public Integer gameTime = null;
}
