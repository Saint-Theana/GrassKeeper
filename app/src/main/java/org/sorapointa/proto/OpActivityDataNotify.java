package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OpActivityInfo.*;
import org.sorapointa.proto.OpActivityInfo;

public class OpActivityDataNotify {
    public enum OpActivityDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5187) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public List<OpActivityInfo> opActivityInfoList = new ArrayList<>();
}
