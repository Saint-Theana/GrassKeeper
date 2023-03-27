package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BrickBreakerPlayerSetChangingNotify {
    public enum MKCDBGCBFAL {
        @Tag(tag=0) None ,
        @Tag(tag=5366) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public Boolean isChanging = null;
    @Tag(tag=9) public Integer uid = null;
}
