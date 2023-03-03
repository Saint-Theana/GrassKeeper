package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MuqadasPotionLevelData.*;
import org.sorapointa.proto.MuqadasPotionLevelData;

public class MuqadasPotionActivityDetailInfo {
    @Tag(tag=8) public List<MuqadasPotionLevelData> muqadasPotionLevelDataList = new ArrayList<>();
}
