package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FoundationInfo.*;
import org.sorapointa.proto.FoundationInfo;

public class FoundationNotify {
    public enum FoundationNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=839) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public Integer gadgetEntityId = null;
    @Tag(tag=2) public FoundationInfo info = null;
}
