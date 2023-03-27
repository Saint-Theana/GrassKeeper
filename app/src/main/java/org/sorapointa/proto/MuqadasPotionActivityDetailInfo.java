package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MuqadasPotionActivityDetailInfo {
    @Tag(tag=10) public List<MuqadasPotionLevelData> muqadasPotionLevelDataList = new ArrayList<>();
}
