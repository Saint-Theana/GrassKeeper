package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ClientInputType.*;
import org.sorapointa.proto.ClientInputType;

public class ViewLanternProjectionTipsReq {
    public enum ViewLanternProjectionTipsReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8102) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public Boolean isInputTips = null;
    @Tag(tag=1) public Integer inputType = null;
}
