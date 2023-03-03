package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.InferencePageInfo.*;
import org.sorapointa.proto.InferencePageInfo;

public class ParentQuestInferenceDataNotify {
    @Tag(tag=2) public Integer parentQuestId = null;
    @Tag(tag=1) public List<InferencePageInfo> inferencePageList = new ArrayList<>();
}
