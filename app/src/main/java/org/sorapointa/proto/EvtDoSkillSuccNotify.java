package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtDoSkillSuccNotify {
    public enum EvtDoSkillSuccNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=398) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13) public Integer skillId = null;
    @Tag(tag=5) public Integer forwardType = null;
    @Tag(tag=2) public Integer casterId = null;
    @Tag(tag=14) public Vector forward = null;
}
