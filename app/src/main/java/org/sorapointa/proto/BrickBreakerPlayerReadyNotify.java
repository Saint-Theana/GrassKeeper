package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BrickBreakerPlayerReadyNotify {
    public enum DFGMIAMDBJK {
        @Tag(tag=0) None ,
        @Tag(tag=5332) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public List<Integer> uidList = new ArrayList<>();
}
