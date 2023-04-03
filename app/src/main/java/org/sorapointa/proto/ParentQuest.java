package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ParentQuestRandomInfo.*;
import org.sorapointa.proto.ParentQuestRandomInfo;
import org.sorapointa.proto.ChildQuest.*;
import org.sorapointa.proto.ChildQuest;
import org.sorapointa.proto.InferencePageInfo.*;
import org.sorapointa.proto.InferencePageInfo;

public class ParentQuest {
    public static class MapTimeVarMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=7) public ParentQuestRandomInfo randomInfo = null;
    @Tag(tag=8,isSigned=true) public List<Integer> questVar = new ArrayList<>();
    @Tag(tag=10) public List<ChildQuest> childQuestList = new ArrayList<>();
    @Tag(tag=9) public Boolean isFinished = null;
    @Tag(tag=11) public Boolean isRandom = null;
    @Tag(tag=1) public Integer parentQuestId = null;
    @Tag(tag=12) public List<MapTimeVarMap> timeVarMap = new ArrayList<>();
    @Tag(tag=15) public Integer parentQuestState = null;
    @Tag(tag=2) public Long videoKey = null;
    @Tag(tag=5) public List<InferencePageInfo> inferencePageList = new ArrayList<>();
    @Tag(tag=4) public Integer questVarSeq = null;
}
