package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChildQuest.*;
import org.sorapointa.proto.ChildQuest;
import org.sorapointa.proto.InferencePageInfo.*;
import org.sorapointa.proto.InferencePageInfo;
import org.sorapointa.proto.ParentQuestRandomInfo.*;
import org.sorapointa.proto.ParentQuestRandomInfo;

public class ParentQuest {
    public static class MapTimeVarMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=14,isSigned=true) public List<Integer> questVar = new ArrayList<>();
    @Tag(tag=8) public List<MapTimeVarMap> timeVarMap = new ArrayList<>();
    @Tag(tag=1) public Integer parentQuestState = null;
    @Tag(tag=7) public Boolean isFinished = null;
    @Tag(tag=15) public List<InferencePageInfo> inferencePageList = new ArrayList<>();
    @Tag(tag=12) public ParentQuestRandomInfo randomInfo = null;
    @Tag(tag=3) public Integer parentQuestId = null;
    @Tag(tag=13) public Boolean isRandom = null;
    @Tag(tag=6) public Long videoKey = null;
    @Tag(tag=11) public Integer questVarSeq = null;
    @Tag(tag=9) public List<ChildQuest> childQuestList = new ArrayList<>();
}
