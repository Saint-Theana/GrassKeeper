package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class GetScenePerformanceRsp {
    @Tag(tag=9) public Integer monsterNum = null;
    @Tag(tag=1) public Integer gatherNumInsight = null;
    @Tag(tag=6) public Integer gadgetNum = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public Integer dynamicGroupNum = null;
    @Tag(tag=2) public Integer groupNum = null;
    @Tag(tag=4) public Vector pos = null;
    @Tag(tag=8) public Integer entityNum = null;
    @Tag(tag=13) public Integer gatherNum = null;
}
