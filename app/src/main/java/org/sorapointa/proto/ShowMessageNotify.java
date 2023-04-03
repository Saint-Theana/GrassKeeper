package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SvrMsgId.*;
import org.sorapointa.proto.SvrMsgId;
import org.sorapointa.proto.MsgParam.*;
import org.sorapointa.proto.MsgParam;

public class ShowMessageNotify {
    public enum ShowMessageNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=98) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer msgId = null;
    @Tag(tag=5) public List<MsgParam> params = new ArrayList<>();
}
