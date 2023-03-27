package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LanV3BoatGameTransferFinishNotify {
    public enum PFJCBLLEFGB {
        @Tag(tag=0) None ,
        @Tag(tag=20696) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Boolean isReenter = null;
}
