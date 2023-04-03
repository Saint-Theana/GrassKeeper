package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;
import org.sorapointa.proto.HuntingPair.*;
import org.sorapointa.proto.HuntingPair;

public class HuntingRevealClueNotify {
    public enum HuntingRevealClueNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4335) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Integer finishedGroupId = null;
    @Tag(tag=11) public Integer finishClueCount = null;
    @Tag(tag=5) public Vector cluePosition = null;
    @Tag(tag=4) public HuntingPair huntingPair = null;
}
