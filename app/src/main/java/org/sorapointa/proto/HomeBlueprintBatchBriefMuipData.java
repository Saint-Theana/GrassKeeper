package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeBlueprintBriefMuipData.*;
import org.sorapointa.proto.HomeBlueprintBriefMuipData;

public class HomeBlueprintBatchBriefMuipData {
    @Tag(tag=1) public List<HomeBlueprintBriefMuipData> briefList = new ArrayList<>();
    @Tag(tag=2) public List<String> notExistShareCodeList = new ArrayList<>();
}
