package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EvtAnimatorParameterInfo.*;
import org.sorapointa.proto.EvtAnimatorParameterInfo;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;

public class EvtAnimatorParameterNotify {
    public enum EvtAnimatorParameterNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=355) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public EvtAnimatorParameterInfo animatorParamInfo = null;
    @Tag(tag=4) public Integer forwardType = null;
}
