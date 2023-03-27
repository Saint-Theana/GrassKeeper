package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ParentQuestInferenceDataNotify {
    public enum BJCFOHDNKDI {
        @Tag(tag=0) None ,
        @Tag(tag=463) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer parentQuestId = null;
    @Tag(tag=11) public List<InferencePageInfo> inferencePageList = new ArrayList<>();
}
