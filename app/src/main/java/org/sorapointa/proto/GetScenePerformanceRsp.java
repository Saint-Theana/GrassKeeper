package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class GetScenePerformanceRsp {
    public enum GetScenePerformanceRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3336) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer gatherNumInsight = null;
    @Tag(tag=3) public Integer dynamicGroupNum = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public Integer entityNum = null;
    @Tag(tag=8) public Integer gatherNum = null;
    @Tag(tag=15) public Vector pos = null;
    @Tag(tag=11) public Integer monsterNum = null;
    @Tag(tag=13) public Integer groupNum = null;
    @Tag(tag=12) public Integer gadgetNum = null;
}
