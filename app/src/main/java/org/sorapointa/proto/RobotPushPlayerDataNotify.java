package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RobotPushPlayerDataNotify {
    public enum RobotPushPlayerDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=16) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public byte[] bin = null;
}
