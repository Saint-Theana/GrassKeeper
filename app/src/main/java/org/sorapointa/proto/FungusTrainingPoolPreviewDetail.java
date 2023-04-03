package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FungusTrainingMonsterPreviewDetail.*;
import org.sorapointa.proto.FungusTrainingMonsterPreviewDetail;

public class FungusTrainingPoolPreviewDetail {
    @Tag(tag=10) public Integer poolId = null;
    @Tag(tag=5) public List<FungusTrainingMonsterPreviewDetail> monsterPreviewDetailList = new ArrayList<>();
}
