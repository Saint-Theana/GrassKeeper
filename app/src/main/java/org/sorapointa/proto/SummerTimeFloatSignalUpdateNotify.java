package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class SummerTimeFloatSignalUpdateNotify {
    public enum SummerTimeFloatSignalUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8586) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Vector position = null;
    @Tag(tag=11) public Boolean isTransferAnchor = null;
    @Tag(tag=14) public Integer floatSignalId = null;
}
