package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SummerTimeFloatSignalPositionNotify {
    public enum SummerTimeFloatSignalPositionNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8322) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public Boolean isTransferAnchor = null;
    @Tag(tag=3) public Integer floatSignalId = null;
    @Tag(tag=10) public Vector position = null;
}
