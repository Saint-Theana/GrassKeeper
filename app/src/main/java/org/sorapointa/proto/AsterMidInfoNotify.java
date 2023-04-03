package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AsterMidDetailInfo.*;
import org.sorapointa.proto.AsterMidDetailInfo;

public class AsterMidInfoNotify {
    public enum AsterMidInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2007) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public AsterMidDetailInfo info = null;
}
